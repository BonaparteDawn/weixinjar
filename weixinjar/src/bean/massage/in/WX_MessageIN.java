package bean.massage.in;

import bean.WX_Object;
import util.WX_REQ_Util;

/**
 * 传输进来的消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:02:28
 * @version 1.0
 */
public class WX_MessageIN  extends WX_Object{
	/**
	 * 开发者微信号
	 */
	private String ToUserName;
	/**
	 * 发送方账号（一个OpenID）
	 */
	private String FromUserName;
	/**
	 * 消息创建时间
	 */
	private long CreateTime;
	/**
	 * 消息类型
	 */
	private WX_REQ_Util MsgType;
	
	/**
	 * 获得{@link #ToUserName}的值
	 * @return 成员变量ToUserName (数据类型 String)
	 */
	public String getToUserName() {
		return ToUserName;
	}

	/**
	 * 获得{@link #FromUserName}的值
	 * @return 成员变量FromUserName (数据类型 String)
	 */
	public String getFromUserName() {
		return FromUserName;
	}

	/**
	 * 获得{@link #CreateTime}的值
	 * @return 成员变量CreateTime (数据类型 long)
	 */
	public long getCreateTime() {
		return CreateTime;
	}

	/**
	 * 获得{@link #MsgType}的值
	 * @return 成员变量MsgType (数据类型 WX_REQ_Util)
	 */
	public WX_REQ_Util getMsgType() {
		return MsgType;
	}

	/**
	 * 设置成员变量{@link #ToUserName}的值
	 * @param toUserName 成员变量 (数据类型 String)
	 */
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	/**
	 * 设置成员变量{@link #FromUserName}的值
	 * @param fromUserName 成员变量 (数据类型 String)
	 */
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	/**
	 * 设置成员变量{@link #CreateTime}的值
	 * @param createTime 成员变量 (数据类型 long)
	 */
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	/**
	 * 设置成员变量{@link #MsgType}的值
	 * @param msgType 成员变量 (数据类型 WX_REQ_Util)
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
