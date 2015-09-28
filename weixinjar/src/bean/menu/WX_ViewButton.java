package bean.menu;

/**
 * 
 * view类型的按钮
 * @author YanFuzhong
 * @date 2015-9-27 下午04:26:20
 * @version 1.0
 */
public class WX_ViewButton extends WX_ButtonBase {
	/**
	 * 按钮类型
	 */
	private String type;
	/**
	 * 按钮链接
	 */
	private String url;
	/**
	 * 获得{@link #type}的值
	 * @return 成员变量type (数据类型 String)
	 */
	public String getType() {
		return type;
	}
	/**
	 * 获得{@link #url}的值
	 * @return 成员变量url (数据类型 String)
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置成员变量{@link #type}的值
	 * @param type 成员变量 (数据类型 String)
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 设置成员变量{@link #url}的值
	 * @param url 成员变量 (数据类型 String)
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_ViewButton [type=" + type + ", url=" + url + "]";
	}
}