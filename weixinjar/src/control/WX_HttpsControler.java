package control;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;
import java.security.SecureRandom;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;


import util.WX_API;
import util.WX_Method_Util;

import bean.WX_APIToken;
import bean.WX_Object;

/**
 * 
 * HTTPͨ�ù�����
 * @author YanFuzhong
 * @date 2015-9-27 ����12:43:51
 * @version 1.0
 */
public class WX_HttpsControler extends WX_Object{
	/**
	 *  ƾ֤��ȡ��API��GET��
	 */
	public final static String GET_TOCKEN_API = WX_API.GET_TOCKEN;
	/**
	 * ����https����
	 * @param api �����ַ
	 * @param method ����ʽ��GET��POST��
	 * @param outputStr �ύ������
	 * @return JSONObject
	 */
	public JSONObject httpsRequest(String api, WX_Method_Util method, String outputStr) {
		JSONObject jsonObject = null;
		try {
			// ����SSLContext���󣬲�ʹ������ָ�������ι�������ʼ��
			TrustManager[] tm = { new WX_X509TrustManager() };
			SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
			sslContext.init(null, tm, new SecureRandom());
			// ������SSLContext�����еõ�SSLSocketFactory����
			SSLSocketFactory ssf = sslContext.getSocketFactory();

			URL url = new URL(api);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setSSLSocketFactory(ssf);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			// ��������ʽ��GET/POST��
			conn.setRequestMethod(method.toString());

			// ��outputStr��Ϊnullʱ�������д����
			OutputStream outputStream = conn.getOutputStream();
			if (null != outputStr && outputStream !=null) {
				write(outputStr, outputStream);
				outputStream.close();
				outputStream=null;
			}else {
				log.info("httpsû���ύ������ ���� �����Ϊnull");
			}
			// ����������ȡ��������
			InputStream inputStream = conn.getInputStream();
			String info = null;
			if (inputStream !=null) {
				info=read(inputStream);
				inputStream.close();
				inputStream = null;
			}else {
				log.info("������Ϊnull");
			}
			
			conn.disconnect();
			log.info(info);
			jsonObject = JSONObject.fromObject(info);
		} catch (ConnectException ce) {
			log.error("���ӳ�ʱ��{}", ce);
		} catch (Exception e) {
			log.error("https�����쳣��{}", e);
		}
		return jsonObject;
	}

	/**
	 * ��ȡ�ӿڷ���ƾ֤
	 * @param appid ƾ֤
	 * @param appsecret ��Կ
	 * @return
	 */
	public  WX_APIToken getToken(String appid, String appsecret) {
		WX_APIToken token = null;
		String requestUrl = GET_TOCKEN_API.replace("APPID", appid).replace("APPSECRET", appsecret);
		// ����GET�����ȡƾ֤
		JSONObject jsonObject = httpsRequest(requestUrl, WX_Method_Util.GET, null);
		if (null != jsonObject) {
			try {
				token = new WX_APIToken();
				token.setAccess_token(jsonObject.getString("access_token"));
				token.setExpires_in(jsonObject.getString("expires_in"));
			} catch (JSONException e) {
				log.error(e.getMessage());
			}
		}
		return token;
	}
}