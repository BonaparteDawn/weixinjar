package bean.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * �������͵İ�ť
 * @author YanFuzhong
 * @date 2015-9-27 ����04:26:44
 * @version 1.0
 */
public class WX_ComplexButton extends WX_ButtonBase {
	/**
	 * ��ť��װ��
	 */
	private List<WX_ButtonBase> sub_button = new ArrayList<WX_ButtonBase>();

	/**
	 * ���{@link #sub_button}��ֵ
	 * @return ��Ա����sub_button (�������� List<WX_ButtonBase>)
	 */
	public List<WX_ButtonBase> getSub_button() {
		return sub_button;
	}

	/**
	 * ���ó�Ա����{@link #sub_button}��ֵ
	 * @param sub_button ��Ա���� (�������� List<WX_ButtonBase>)
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
