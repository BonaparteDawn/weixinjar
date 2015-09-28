package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 文本消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:01:57
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_TextMessage_IN extends WX_BaseMessage_IN{
	/**
	 * 消息内容
	 */
	private String Content;
	
	/**
	 * 获得{@link #Content}的值
	 * @return 成员变量Content (数据类型 String)
	 */
	public String getContent() {
		return Content;
	}

	/**
	 * 设置成员变量{@link #Content}的值
	 * @param content 成员变量 (数据类型 String)
	 */
	public void setContent(String content) {
		Content = content;
	}

	@Override
	public String toString() {
		return "WX_TextMessage_IN [Content=" + Content + "]";
	}
}
