package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 链接消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:01:03
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_LinkMessage_IN  extends WX_BaseMessage_IN{
	/**
	 * 消息标题
	 */
	private String Title;
	/**
	 * 消息描述
	 */
	private String Description;
	/**
	 * 消息链接
	 */
	private String Url;
	
	/**
	 * 获得{@link #Title}的值
	 * @return 成员变量Title (数据类型 String)
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * 获得{@link #Description}的值
	 * @return 成员变量Description (数据类型 String)
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * 获得{@link #Url}的值
	 * @return 成员变量Url (数据类型 String)
	 */
	public String getUrl() {
		return Url;
	}

	/**
	 * 设置成员变量{@link #Title}的值
	 * @param title 成员变量 (数据类型 String)
	 */
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * 设置成员变量{@link #Description}的值
	 * @param description 成员变量 (数据类型 String)
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * 设置成员变量{@link #Url}的值
	 * @param url 成员变量 (数据类型 String)
	 */
	public void setUrl(String url) {
		Url = url;
	}

	@Override
	public String toString() {
		return "WX_LinkMessage_IN [Title=" + Title + ", Description="
				+ Description + ", Url=" + Url + "]";
	}
}
