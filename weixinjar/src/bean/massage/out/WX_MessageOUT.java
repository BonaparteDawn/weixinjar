package bean.massage.out;

import bean.WX_Object;
import util.WX_RESP_Util;

/**
 * �������Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:08:02
 * @version 1.0
 */
public class WX_MessageOUT  extends WX_Object{
	/**
	 * ���շ��˺� (�յ���OpenID)
	 */
	private String ToUserName;
	/**
	 * ������΢�ź�
	 */
	private String FromUserName;
	/**
	 * ��Ϣ����ʱ��
	 */
	private long CreateTime;
	/**
	 * ��Ϣ����
	 */
	private WX_RESP_Util MsgType;
	
	/**
	 * ���{@link #ToUserName}��ֵ
	 * @return ��Ա����ToUserName (�������� String)
	 */
	public String getToUserName() {
		return ToUserName;
	}

	/**
	 * ���{@link #FromUserName}��ֵ
	 * @return ��Ա����FromUserName (�������� String)
	 */
	public String getFromUserName() {
		return FromUserName;
	}

	/**
	 * ���{@link #CreateTime}��ֵ
	 * @return ��Ա����CreateTime (�������� long)
	 */
	public long getCreateTime() {
		return CreateTime;
	}

	/**
	 * ���{@link #MsgType}��ֵ
	 * @return ��Ա����MsgType (�������� WX_RESP_Util)
	 */
	public WX_RESP_Util getMsgType() {
		return MsgType;
	}

	/**
	 * ���ó�Ա����{@link #ToUserName}��ֵ
	 * @param toUserName ��Ա���� (�������� String)
	 */
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	/**
	 * ���ó�Ա����{@link #FromUserName}��ֵ
	 * @param fromUserName ��Ա���� (�������� String)
	 */
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	/**
	 * ���ó�Ա����{@link #CreateTime}��ֵ
	 * @param createTime ��Ա���� (�������� long)
	 */
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	/**
	 * ���ó�Ա����{@link #MsgType}��ֵ
	 * @param msgType ��Ա���� (�������� WX_RESP_Util)
	 */
	public void setMsgType(WX_RESP_Util msgType) {
		MsgType = msgType;
	}

	@Override
	public String toString() {
		return "WX_MessageOUT [ToUserName=" + ToUserName + ", FromUserName="
				+ FromUserName + ", CreateTime=" + CreateTime + ", MsgType="
				+ MsgType + "]";
	}
}