package bean;
/**
 * APIƾ֤(����API�ӿں󣬷��������ص�ƾ֤)
 * @author YanFuzhong
 * @date 2015-9-27 ����01:24:00
 * @version 1.0
 */
public class WX_APIToken {
	/**�ӿڷ���ƾ֤*/
	private String access_token;
	/**ƾ֤����Чʱ�䣨��λ���룩*/
	private String expires_in;
	/**
	 * ���{@link #access_token}��ֵ
	 * @return ��Ա����access_token (�������� String)
	 */
	public String getAccess_token() {
		return access_token;
	}
	/**
	 * ���{@link #expires_in}��ֵ
	 * @return ��Ա����expires_in (�������� String)
	 */
	public String getExpires_in() {
		return expires_in;
	}
	/**
	 * ���ó�Ա����{@link #access_token}��ֵ
	 * @param access_token ��Ա���� (�������� String)
	 */
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	/**
	 * ���ó�Ա����{@link #expires_in}��ֵ
	 * @param expires_in ��Ա���� (�������� String)
	 */
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_APIToken [access_token=" + access_token + ", expires_in="
				+ expires_in + "]";
	}
	
}
