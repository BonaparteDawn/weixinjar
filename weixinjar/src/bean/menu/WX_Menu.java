package bean.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * �˵�
 * @author YanFuzhong
 * @date 2015-9-27 ����04:26:31
 * @version 1.0
 */
public class WX_Menu {
	/**
	 * �˵��Ӱ�ť
	 */
	private List<WX_ButtonBase> button = new ArrayList<WX_ButtonBase>();

	/**
	 * ���{@link #button}��ֵ
	 * @return ��Ա����button (�������� List<WX_ButtonBase>)
	 */
	public List<WX_ButtonBase> getButton() {
		return button;
	}

	/**
	 * ���ó�Ա����{@link #button}��ֵ
	 * @param button ��Ա���� (�������� List<WX_ButtonBase>)
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
