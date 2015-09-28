package bean.menu;

/**
 * 
 * click类型的按钮
 * @author YanFuzhong
 * @date 2015-9-27 下午04:26:59
 * @version 1.0
 */
public class WX_ClickButton extends WX_ButtonBase {
	/**
	 * 按钮的类型
	 */
	private String type;
	/**
	 * 按钮的键值
	 */
	private String key;
	/**
	 * 获得{@link #type}的值
	 * @return 成员变量type (数据类型 String)
	 */
	public String getType() {
		return type;
	}
	/**
	 * 获得{@link #key}的值
	 * @return 成员变量key (数据类型 String)
	 */
	public String getKey() {
		return key;
	}
	/**
	 * 设置成员变量{@link #type}的值
	 * @param type 成员变量 (数据类型 String)
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 设置成员变量{@link #key}的值
	 * @param key 成员变量 (数据类型 String)
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_ClickButton [type=" + type + ", key=" + key + "]";
	}
	
}