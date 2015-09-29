package control;

import util.WX_Static;
import bean.WX_APIToken;

public abstract class WX_APIContrler extends WX_HttpsControler{
	public WX_APIToken getApiToken(){
		String appid =WX_Static.devConfig.getAppID();
		String appsecret = WX_Static.devConfig.getAppSecret();
		WX_APIToken tocken = getToken(appid, appsecret);
		return tocken;
	}
	public String getAccessTocken(){
		return getApiToken().getAccess_token();
	}
}
