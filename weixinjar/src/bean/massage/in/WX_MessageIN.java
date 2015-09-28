package bean.massage.in;

import bean.WX_Object;
import util.WX_REQ_Util;

/**
 * �����������Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:02:28
 * @version 1.0
 */
public class WX_MessageIN  extends WX_Object{
	/**
	 * ������΢�ź�
	 */
	private String ToUserName;
	/**
	 * ���ͷ��˺ţ�һ��OpenID��
	 */
	private String FromUserName;
	/**
	 * ��Ϣ����ʱ��
	 */
	private long CreateTime;
	/**
	 * ��Ϣ����
	 */
	private WX_REQ_Util MsgType;
	
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
	 * @return ��Ա����MsgType (�������� WX_REQ_Util)
	 */
	public WX_REQ_Util getMsgType() {
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
	 * @param msgType ��Ա���� (�������� WX_REQ_Util)
	 */
	public void setMsgType(WX_REQ_Util msgType) {
		MsgType = msgType;
	}

	@Override
	public String toString() {
		return "WX_MessageIN [ToUserName=" + ToUserName + ", FromUserName="
				+ FromUserName + ", CreateTime=" + CreateTime + ", MsgType="
				+ MsgType + "]";
	}
}
