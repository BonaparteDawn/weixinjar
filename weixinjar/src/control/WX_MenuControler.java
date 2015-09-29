package control;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import util.WX_API;
import util.WX_API_args;
import util.WX_Button_Util;
import util.WX_Method_Util;
import bean.WX_ReturnCode;
import bean.menu.WX_ButtonBase;
import bean.menu.WX_ClickButton;
import bean.menu.WX_ComplexButton;
import bean.menu.WX_Menu;
import bean.menu.WX_ViewButton;
import control.interfaces.WX_DataOperate;

public class WX_MenuControler extends WX_APIContrler  implements WX_DataOperate<WX_Menu>{
	
	/**
	 * 添加菜单的API
	 */
	private String ADD_API=WX_API.CREATE_MENU;
	/**
	 * 删除菜单的API
	 */
	private String DELETE_API=WX_API.DELETE_MENU;
	/**
	 * 得到菜单的API
	 */
	private String GET_API=WX_API.GET_MENU;
	/**
	 * 添加一个菜单{@link WX_Menu}
	 * @param e
	 * @return WX_ReturnCode
	 */
	@Override
	public WX_ReturnCode add(WX_Menu e) {
		WX_ReturnCode res = null;
		//获得访问TOCKETN
		String tocken =getAccessTocken();
		//API赋值参数
		String api=ADD_API.replaceAll(WX_API_args.ACCESS_TOKEN.toString(), tocken);
		//发送HTTPS请求
		JSONObject json =httpsRequest(api, WX_Method_Util.POST, JSONObject.fromObject(e).toString());
		//根据HTTPS返回的结果，判断是否处理成功
		if (json !=null) {
			res=(WX_ReturnCode) JSONObject.toBean(json,WX_ReturnCode.class);
		}
		return res;
	}
	/**
	 * 默认只添加最后一个菜单{@link WX_Menu}
	 * @param list
	 * @return WX_ReturnCode
	 */
	@Override
	public WX_ReturnCode add(List<WX_Menu> list) {
		WX_ReturnCode res = null;
		WX_Menu temp=list.get(list.size()-1);
		res=add(temp);
		return res;
	}
	/**
	 * 删除菜单
	 * @return WX_ReturnCode
	 */
	@Override
	public WX_ReturnCode delete() {
		WX_ReturnCode res = null;
		//获得访问TOCKETN
		String tocken =getAccessTocken();
		//API赋值参数
		String api=DELETE_API.replaceAll(WX_API_args.ACCESS_TOKEN.toString(), tocken);
		//发送HTTPS请求
		JSONObject json =httpsRequest(api, WX_Method_Util.POST, null);
		//根据HTTPS返回的结果，判断是否处理成功
		if (json != null) {
			res=(WX_ReturnCode) JSONObject.toBean(json,WX_ReturnCode.class);
		}
		return res;
	}
	/**
	 * 删除整个菜单
	 * @param e 删除菜单与其无关
	 * @return WX_ReturnCode
	 */
	@Override
	public WX_ReturnCode delete(WX_Menu e) {
		return delete();
	}
	/**
	 * 修改菜单{@link WX_Menu}
	 * @param e
	 * @return WX_ReturnCode
	 */ 
	@Override
	public WX_ReturnCode modify(WX_Menu e) {
		return add(e);
	}
	/**
	 * 默认只修改最后一个菜单{@link WX_Menu}
	 * @param list
	 * @return WX_ReturnCode
	 */
	@Override
	public WX_ReturnCode modify(List<WX_Menu> list) {
		return add(list);
	}
	/**
	 * 获得该微信菜单
	 * @param e
	 * @return WX_Menu
	 */ 
	@Override
	public WX_Menu get(WX_Menu e) {
		WX_Menu res= new WX_Menu();
		//获得访问TOCKETN
		String tocken =getAccessTocken();
		//API赋值参数
		String api=GET_API.replaceAll(WX_API_args.ACCESS_TOKEN.toString(), tocken);
		//发送HTTPS请求
		JSONObject json =httpsRequest(api, WX_Method_Util.POST,null);
		//根据HTTPS返回的结果
		if (json==null) {
			log.error("https微信菜单json格式获取失败！！！");
		}
		parseToMenu(res, json);
		return res;
	}
	/**
	 * 将服务器的json格式的菜单反序列化成菜单对象
	 * @param res
	 * @param json
	 */
	private void parseToMenu(WX_Menu res, JSONObject json) {
		if (json ==null || res ==null ) {
			log.error("json格式的菜单反序列化成菜单对象失败！！！");
			return;
		}
		JSONObject root=JSONObject.fromObject(json.get("menu"));
		JSONArray bts = root.getJSONArray("button");
		for (Object object : bts) {
			JSONObject bt= JSONObject.fromObject(object);
			WX_ComplexButton cb = new WX_ComplexButton();
			cb.setName(bt.getString("name"));
			JSONArray subs = bt.getJSONArray("sub_button");
			for (Object object2 : subs) {
				WX_ButtonBase buttonBase = null;;
				JSONObject sub = JSONObject.fromObject(object2);
				String type =sub.getString("type");
				String name =sub.getString("name");
				if (type.equals(WX_Button_Util.click.toString())) {
					String key = sub.getString("key");
					WX_ClickButton button = new WX_ClickButton();
					button.setKey(key);
					button.setName(name);
					button.setType(type);
					buttonBase=button;
				}else if (type.equals(WX_Button_Util.view.toString())) {
					String url = sub.getString("url");
					WX_ViewButton button = new WX_ViewButton();
					button.setName(name);
					button.setType(type);
					button.setUrl(url);
					buttonBase=button;
				}else {
					log.error("不存在该类型的Button");
				}
				cb.getSub_button().add(buttonBase);
			}
			res.getButton().add(cb);
		}
	}
	/**
	 * 获得该微信菜单,默认是第一个
	 * @return List<WX_Menu>
	 */ 
	@Override
	public List<WX_Menu> getAll() {
		List<WX_Menu> list = new ArrayList<WX_Menu>();
		list.add(get(null));
		return list;
	}
}
