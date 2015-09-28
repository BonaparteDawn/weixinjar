package bean.massage.in.rcv;

import bean.massage.in.WX_MessageIN;

/**
 * 请求消息基类（普通用户->公众账号）
 * @author YanFuzhong
 * @date 2015-9-24 下午10:00:08
 * @version 1.0
 */
public class WX_BaseMessage_IN extends WX_MessageIN{
	/**
	 * 消息ID (64位整数)
	 */
	private long MsgId;
	
	/**
	 * 获得{@link #MsgId}的值
	 * @return 成员变量MsgId (数据类型 long)
	 */
	public long getMsgId() {
		return MsgId;
	}

	/**
	 * 设置成员变量{@link #MsgId}的值
	 * @param msgId 成员变量 (数据类型 long)
	 */
	public void setMsgId(long msgId) {
		MsgId = msgId;
	}

	@Override
	public String toString() {
		return "WX_BaseMessage_IN [MsgId=" + MsgId + "]";
	}
}
