package util;
/**
 * ΢�����е�API�ӿ�
 * @author YanFuzhong
 * @date 2015-9-27 ����12:40:45
 * @version
 */
public class WX_API {
	/**��ȡƾ֤*/
	public static String GET_TOCKEN;
	/**�˵����*/
	public static String CREATE_MENU;
	/**�˵���ѯ*/
	public static String GET_MENU;
	/**�˵�ɾ��*/
	public static String DELETE_MENU;
	static{
		GET_TOCKEN="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
		CREATE_MENU="https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
		GET_MENU="https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
		DELETE_MENU="https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
	}
}