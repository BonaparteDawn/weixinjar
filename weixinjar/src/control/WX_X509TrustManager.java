package control;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/**
 * 
 * �Զ���֤��
 * @author YanFuzhong
 * @date 2015-9-27 ����03:01:10
 * @version 1.0
 */
public class WX_X509TrustManager implements X509TrustManager {


	/**
	 *  ���ͻ���֤��
	 */
	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	}

	/**
	 *  ����������֤��
	 */
	@Override
	public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	}

	/**
	 *  ���������ε�X509֤������
	 */
	@Override
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}

}
