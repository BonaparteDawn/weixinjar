package bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * 开发者账号配置中心
 * @author YanFuzhong
 * @date 2015-9-25 下午05:20:51
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_DeveloperConfig extends WX_Object{
	/**
	 * 微信名称
	 */
	private String WeChatName;
	/**
	 * 微信号
	 */
	private String WeChatNumber;
	/**
	 * 注册信息原始ID
	 */
	private String originalId;
	/**
	 * 应用ID
	 */
	private String AppID;
	/**
	 * 应用秘钥
	 */
	private String AppSecret;
	/**
	 * 令牌
	 */
	private String Token;
	/**
	 * 消息加解密秘钥
	 */
	private String EncodingAESKey;
	/**
	 * 获得{@link #WeChatName}的值
	 * @return 成员变量WeChatName (数据类型 String)
	 */
	public String getWeChatName() {
		return WeChatName;
	}
	/**
	 * 获得{@link #WeChatNumber}的值
	 * @return 成员变量WeChatNumber (数据类型 String)
	 */
	public String getWeChatNumber() {
		return WeChatNumber;
	}
	/**
	 * 获得{@link #originalId}的值
	 * @return 成员变量originalId (数据类型 String)
	 */
	public String getOriginalId() {
		return originalId;
	}
	/**
	 * 获得{@link #AppID}的值
	 * @return 成员变量AppID (数据类型 String)
	 */
	public String getAppID() {
		return AppID;
	}
	/**
	 * 获得{@link #AppSecret}的值
	 * @return 成员变量AppSecret (数据类型 String)
	 */
	public String getAppSecret() {
		return AppSecret;
	}
	/**
	 * 获得{@link #Token}的值
	 * @return 成员变量Token (数据类型 String)
	 */
	public String getToken() {
		return Token;
	}
	/**
	 * 获得{@link #EncodingAESKey}的值
	 * @return 成员变量EncodingAESKey (数据类型 String)
	 */
	public String getEncodingAESKey() {
		return EncodingAESKey;
	}
	/**
	 * 设置成员变量{@link #WeChatName}的值
	 * @param weChatName 成员变量 (数据类型 String)
	 */
	public void setWeChatName(String weChatName) {
		WeChatName = weChatName;
	}
	/**
	 * 设置成员变量{@link #WeChatNumber}的值
	 * @param weChatNumber 成员变量 (数据类型 String)
	 */
	public void setWeChatNumber(String weChatNumber) {
		WeChatNumber = weChatNumber;
	}
	/**
	 * 设置成员变量{@link #originalId}的值
	 * @param originalId 成员变量 (数据类型 String)
	 */
	public void setOriginalId(String originalId) {
		this.originalId = originalId;
	}
	/**
	 * 设置成员变量{@link #AppID}的值
	 * @param appID 成员变量 (数据类型 String)
	 */
	public void setAppID(String appID) {
		AppID = appID;
	}
	/**
	 * 设置成员变量{@link #AppSecret}的值
	 * @param appSecret 成员变量 (数据类型 String)
	 */
	public void setAppSecret(String appSecret) {
		AppSecret = appSecret;
	}
	/**
	 * 设置成员变量{@link #Token}的值
	 * @param token 成员变量 (数据类型 String)
	 */
	public void setToken(String token) {
		Token = token;
	}
	/**
	 * 设置成员变量{@link #EncodingAESKey}的值
	 * @param encodingAESKey 成员变量 (数据类型 String)
	 */
	public void setEncodingAESKey(String encodingAESKey) {
		EncodingAESKey = encodingAESKey;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_DeveloperConfig [WeChatName=" + WeChatName
				+ ", WeChatNumber=" + WeChatNumber + ", originalId="
				+ originalId + ", AppID=" + AppID + ", AppSecret=" + AppSecret
				+ ", Token=" + Token + ", EncodingAESKey=" + EncodingAESKey
				+ "]";
	}
}
