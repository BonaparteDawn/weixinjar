package control;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/**
 * 
 * 自定义证书
 * @author YanFuzhong
 * @date 2015-9-27 下午03:01:10
 * @version 1.0
 */
public class WX_X509TrustManager implements X509TrustManager {


	/**
	 *  检查客户端证书
	 */
	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	}

	/**
	 *  检查服务器端证书
	 */
	@Override
	public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	}

	/**
	 *  返回受信任的X509证书数组
	 */
	@Override
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}

}
