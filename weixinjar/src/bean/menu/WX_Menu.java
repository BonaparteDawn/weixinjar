package bean.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 菜单
 * @author YanFuzhong
 * @date 2015-9-27 下午04:26:31
 * @version 1.0
 */
public class WX_Menu {
	/**
	 * 菜单子按钮
	 */
	private List<WX_ButtonBase> button = new ArrayList<WX_ButtonBase>();

	/**
	 * 获得{@link #button}的值
	 * @return 成员变量button (数据类型 List<WX_ButtonBase>)
	 */
	public List<WX_ButtonBase> getButton() {
		return button;
	}

	/**
	 * 设置成员变量{@link #button}的值
	 * @param button 成员变量 (数据类型 List<WX_ButtonBase>)
	 */
	public void setButton(List<WX_ButtonBase> button) {
		this.button = button;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_Menu [button=" + button + "]";
	}
	
}
