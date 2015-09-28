package bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * �������˺���������
 * @author YanFuzhong
 * @date 2015-9-25 ����05:20:51
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_DeveloperConfig extends WX_Object{
	/**
	 * ΢������
	 */
	private String WeChatName;
	/**
	 * ΢�ź�
	 */
	private String WeChatNumber;
	/**
	 * ע����ϢԭʼID
	 */
	private String originalId;
	/**
	 * Ӧ��ID
	 */
	private String AppID;
	/**
	 * Ӧ����Կ
	 */
	private String AppSecret;
	/**
	 * ����
	 */
	private String Token;
	/**
	 * ��Ϣ�ӽ�����Կ
	 */
	private String EncodingAESKey;
	/**
	 * ���{@link #WeChatName}��ֵ
	 * @return ��Ա����WeChatName (�������� String)
	 */
	public String getWeChatName() {
		return WeChatName;
	}
	/**
	 * ���{@link #WeChatNumber}��ֵ
	 * @return ��Ա����WeChatNumber (�������� String)
	 */
	public String getWeChatNumber() {
		return WeChatNumber;
	}
	/**
	 * ���{@link #originalId}��ֵ
	 * @return ��Ա����originalId (�������� String)
	 */
	public String getOriginalId() {
		return originalId;
	}
	/**
	 * ���{@link #AppID}��ֵ
	 * @return ��Ա����AppID (�������� String)
	 */
	public String getAppID() {
		return AppID;
	}
	/**
	 * ���{@link #AppSecret}��ֵ
	 * @return ��Ա����AppSecret (�������� String)
	 */
	public String getAppSecret() {
		return AppSecret;
	}
	/**
	 * ���{@link #Token}��ֵ
	 * @return ��Ա����Token (�������� String)
	 */
	public String getToken() {
		return Token;
	}
	/**
	 * ���{@link #EncodingAESKey}��ֵ
	 * @return ��Ա����EncodingAESKey (�������� String)
	 */
	public String getEncodingAESKey() {
		return EncodingAESKey;
	}
	/**
	 * ���ó�Ա����{@link #WeChatName}��ֵ
	 * @param weChatName ��Ա���� (�������� String)
	 */
	public void setWeChatName(String weChatName) {
		WeChatName = weChatName;
	}
	/**
	 * ���ó�Ա����{@link #WeChatNumber}��ֵ
	 * @param weChatNumber ��Ա���� (�������� String)
	 */
	public void setWeChatNumber(String weChatNumber) {
		WeChatNumber = weChatNumber;
	}
	/**
	 * ���ó�Ա����{@link #originalId}��ֵ
	 * @param originalId ��Ա���� (�������� String)
	 */
	public void setOriginalId(String originalId) {
		this.originalId = originalId;
	}
	/**
	 * ���ó�Ա����{@link #AppID}��ֵ
	 * @param appID ��Ա���� (�������� String)
	 */
	public void setAppID(String appID) {
		AppID = appID;
	}
	/**
	 * ���ó�Ա����{@link #AppSecret}��ֵ
	 * @param appSecret ��Ա���� (�������� String)
	 */
	public void setAppSecret(String appSecret) {
		AppSecret = appSecret;
	}
	/**
	 * ���ó�Ա����{@link #Token}��ֵ
	 * @param token ��Ա���� (�������� String)
	 */
	public void setToken(String token) {
		Token = token;
	}
	/**
	 * ���ó�Ա����{@link #EncodingAESKey}��ֵ
	 * @param encodingAESKey ��Ա���� (�������� String)
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
