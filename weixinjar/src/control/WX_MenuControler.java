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
	 * ��Ӳ˵���API
	 */
	private String ADD_API=WX_API.CREATE_MENU;
	/**
	 * ɾ���˵���API
	 */
	private String DELETE_API=WX_API.DELETE_MENU;
	/**
	 * �õ��˵���API
	 */
	private String GET_API=WX_API.GET_MENU;
	/**
	 * ���һ���˵�{@link WX_Menu}
	 * @param e
	 * @return WX_ReturnCode
	 */
	@Override
	public WX_ReturnCode add(WX_Menu e) {
		WX_ReturnCode res = null;
		//��÷���TOCKETN
		String tocken =getAccessTocken();
		//API��ֵ����
		String api=ADD_API.replaceAll(WX_API_args.ACCESS_TOKEN.toString(), tocken);
		//����HTTPS����
		JSONObject json =httpsRequest(api, WX_Method_Util.POST, JSONObject.fromObject(e).toString());
		//����HTTPS���صĽ�����ж��Ƿ���ɹ�
		if (json !=null) {
			res=(WX_ReturnCode) JSONObject.toBean(json,WX_ReturnCode.class);
		}
		return res;
	}
	/**
	 * Ĭ��ֻ������һ���˵�{@link WX_Menu}
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
	 * ɾ���˵�
	 * @return WX_ReturnCode
	 */
	@Override
	public WX_ReturnCode delete() {
		WX_ReturnCode res = null;
		//��÷���TOCKETN
		String tocken =getAccessTocken();
		//API��ֵ����
		String api=DELETE_API.replaceAll(WX_API_args.ACCESS_TOKEN.toString(), tocken);
		//����HTTPS����
		JSONObject json =httpsRequest(api, WX_Method_Util.POST, null);
		//����HTTPS���صĽ�����ж��Ƿ���ɹ�
		if (json != null) {
			res=(WX_ReturnCode) JSONObject.toBean(json,WX_ReturnCode.class);
		}
		return res;
	}
	/**
	 * ɾ�������˵�
	 * @param e ɾ���˵������޹�
	 * @return WX_ReturnCode
	 */
	@Override
	public WX_ReturnCode delete(WX_Menu e) {
		return delete();
	}
	/**
	 * �޸Ĳ˵�{@link WX_Menu}
	 * @param e
	 * @return WX_ReturnCode
	 */ 
	@Override
	public WX_ReturnCode modify(WX_Menu e) {
		return add(e);
	}
	/**
	 * Ĭ��ֻ�޸����һ���˵�{@link WX_Menu}
	 * @param list
	 * @return WX_ReturnCode
	 */
	@Override
	public WX_ReturnCode modify(List<WX_Menu> list) {
		return add(list);
	}
	/**
	 * ��ø�΢�Ų˵�
	 * @param e
	 * @return WX_Menu
	 */ 
	@Override
	public WX_Menu get(WX_Menu e) {
		WX_Menu res= new WX_Menu();
		//��÷���TOCKETN
		String tocken =getAccessTocken();
		//API��ֵ����
		String api=GET_API.replaceAll(WX_API_args.ACCESS_TOKEN.toString(), tocken);
		//����HTTPS����
		JSONObject json =httpsRequest(api, WX_Method_Util.POST,null);
		//����HTTPS���صĽ��
		if (json==null) {
			log.error("https΢�Ų˵�json��ʽ��ȡʧ�ܣ�����");
		}
		parseToMenu(res, json);
		return res;
	}
	/**
	 * ����������json��ʽ�Ĳ˵������л��ɲ˵�����
	 * @param res
	 * @param json
	 */
	private void parseToMenu(WX_Menu res, JSONObject json) {
		if (json ==null || res ==null ) {
			log.error("json��ʽ�Ĳ˵������л��ɲ˵�����ʧ�ܣ�����");
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
					log.error("�����ڸ����͵�Button");
				}
				cb.getSub_button().add(buttonBase);
			}
			res.getButton().add(cb);
		}
	}
	/**
	 * ��ø�΢�Ų˵�,Ĭ���ǵ�һ��
	 * @return List<WX_Menu>
	 */ 
	@Override
	public List<WX_Menu> getAll() {
		List<WX_Menu> list = new ArrayList<WX_Menu>();
		list.add(get(null));
		return list;
	}
}
