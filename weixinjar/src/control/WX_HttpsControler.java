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
 * HTTP通用工具类
 * @author YanFuzhong
 * @date 2015-9-27 下午12:43:51
 * @version 1.0
 */
public class WX_HttpsControler extends WX_Object{
	/**
	 *  凭证获取的API（GET）
	 */
	public final static String GET_TOCKEN_API = WX_API.GET_TOCKEN;
	/**
	 * 发送https请求
	 * @param api 请求地址
	 * @param method 请求方式（GET、POST）
	 * @param outputStr 提交的数据
	 * @return JSONObject
	 */
	public JSONObject httpsRequest(String api, WX_Method_Util method, String outputStr) {
		JSONObject jsonObject = null;
		try {
			// 创建SSLContext对象，并使用我们指定的信任管理器初始化
			TrustManager[] tm = { new WX_X509TrustManager() };
			SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
			sslContext.init(null, tm, new SecureRandom());
			// 从上述SSLContext对象中得到SSLSocketFactory对象
			SSLSocketFactory ssf = sslContext.getSocketFactory();

			URL url = new URL(api);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setSSLSocketFactory(ssf);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			// 设置请求方式（GET/POST）
			conn.setRequestMethod(method.toString());

			// 当outputStr不为null时向输出流写数据
			OutputStream outputStream = conn.getOutputStream();
			if (null != outputStr && outputStream !=null) {
				write(outputStr, outputStream);
				outputStream.close();
				outputStream=null;
			}else {
				log.info("https没有提交的数据 或者 输出流为null");
			}
			// 从输入流读取返回内容
			InputStream inputStream = conn.getInputStream();
			String info = null;
			if (inputStream !=null) {
				info=read(inputStream);
				inputStream.close();
				inputStream = null;
			}else {
				log.info("输入流为null");
			}
			
			conn.disconnect();
			log.info(info);
			jsonObject = JSONObject.fromObject(info);
		} catch (ConnectException ce) {
			log.error("连接超时：{}", ce);
		} catch (Exception e) {
			log.error("https请求异常：{}", e);
		}
		return jsonObject;
	}

	/**
	 * 获取接口访问凭证
	 * @param appid 凭证
	 * @param appsecret 密钥
	 * @return
	 */
	public  WX_APIToken getToken(String appid, String appsecret) {
		WX_APIToken token = null;
		String requestUrl = GET_TOCKEN_API.replace("APPID", appid).replace("APPSECRET", appsecret);
		// 发起GET请求获取凭证
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