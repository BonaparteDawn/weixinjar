package bean;
/**
 * API凭证(调用API接口后，服务器返回的凭证)
 * @author YanFuzhong
 * @date 2015-9-27 下午01:24:00
 * @version 1.0
 */
public class WX_APIToken {
	/**接口访问凭证*/
	private String access_token;
	/**凭证的有效时间（单位：秒）*/
	private String expires_in;
	/**
	 * 获得{@link #access_token}的值
	 * @return 成员变量access_token (数据类型 String)
	 */
	public String getAccess_token() {
		return access_token;
	}
	/**
	 * 获得{@link #expires_in}的值
	 * @return 成员变量expires_in (数据类型 String)
	 */
	public String getExpires_in() {
		return expires_in;
	}
	/**
	 * 设置成员变量{@link #access_token}的值
	 * @param access_token 成员变量 (数据类型 String)
	 */
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	/**
	 * 设置成员变量{@link #expires_in}的值
	 * @param expires_in 成员变量 (数据类型 String)
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
