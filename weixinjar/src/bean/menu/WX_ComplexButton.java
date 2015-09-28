package bean.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 复合类型的按钮
 * @author YanFuzhong
 * @date 2015-9-27 下午04:26:44
 * @version 1.0
 */
public class WX_ComplexButton extends WX_ButtonBase {
	/**
	 * 按钮集装箱
	 */
	private List<WX_ButtonBase> sub_button = new ArrayList<WX_ButtonBase>();

	/**
	 * 获得{@link #sub_button}的值
	 * @return 成员变量sub_button (数据类型 List<WX_ButtonBase>)
	 */
	public List<WX_ButtonBase> getSub_button() {
		return sub_button;
	}

	/**
	 * 设置成员变量{@link #sub_button}的值
	 * @param sub_button 成员变量 (数据类型 List<WX_ButtonBase>)
	 */
	public void setSub_button(List<WX_ButtonBase> sub_button) {
		this.sub_button = sub_button;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_ComplexButton [sub_button=" + sub_button + "]";
	}
	
}
