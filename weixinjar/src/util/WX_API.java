package util;
/**
 * 微信所有的API接口
 * @author YanFuzhong
 * @date 2015-9-27 下午12:40:45
 * @version
 */
public class WX_API {
	/**获取凭证*/
	public static String GET_TOCKEN;
	/**菜单添加*/
	public static String CREATE_MENU;
	/**菜单查询*/
	public static String GET_MENU;
	/**菜单删除*/
	public static String DELETE_MENU;
	static{
		GET_TOCKEN="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
		CREATE_MENU="https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
		GET_MENU="https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
		DELETE_MENU="https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
	}
}