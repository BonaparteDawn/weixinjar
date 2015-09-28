package test.control;

import bean.WX_APIToken;
import util.WX_API;
import util.WX_Method_Util;
import util.WX_Static;
import control.WX_HttpsControler;

public class WX_HttpsControler_Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_HttpsControler util = new WX_HttpsControler();
		WX_APIToken token = util.getToken(WX_Static.devConfig.getAppID(),WX_Static.devConfig.getAppSecret());
		System.out.println(token);
		System.out.println(util.httpsRequest(WX_API.GET_MENU.replace("ACCESS_TOKEN", token.getAccess_token()), WX_Method_Util.GET, null));
	}
}