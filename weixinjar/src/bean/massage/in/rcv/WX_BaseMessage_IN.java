package bean.massage.in.rcv;

import bean.massage.in.WX_MessageIN;

/**
 * ������Ϣ���ࣨ��ͨ�û�->�����˺ţ�
 * @author YanFuzhong
 * @date 2015-9-24 ����10:00:08
 * @version 1.0
 */
public class WX_BaseMessage_IN extends WX_MessageIN{
	/**
	 * ��ϢID (64λ����)
	 */
	private long MsgId;
	
	/**
	 * ���{@link #MsgId}��ֵ
	 * @return ��Ա����MsgId (�������� long)
	 */
	public long getMsgId() {
		return MsgId;
	}

	/**
	 * ���ó�Ա����{@link #MsgId}��ֵ
	 * @param msgId ��Ա���� (�������� long)
	 */
	public void setMsgId(long msgId) {
		MsgId = msgId;
	}

	@Override
	public String toString() {
		return "WX_BaseMessage_IN [MsgId=" + MsgId + "]";
	}
}
