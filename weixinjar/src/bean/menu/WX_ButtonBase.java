package bean.menu;
/**
 * 按钮的基类
 * @author YanFuzhong
 * @date 2015-9-27 下午04:27:07
 * @version 1.0
 */
public class WX_ButtonBase {
	/**
	 * 按钮名称
	 */
	private String name;
	/**
	 * 获得{@link #name}的值
	 * @return 成员变量name (数据类型 String)
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置成员变量{@link #name}的值
	 * @param name 成员变量 (数据类型 String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_ButtonBase [name=" + name + "]";
	}
	
}
