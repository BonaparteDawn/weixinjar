package bean.menu;
/**
 * ��ť�Ļ���
 * @author YanFuzhong
 * @date 2015-9-27 ����04:27:07
 * @version 1.0
 */
public class WX_ButtonBase {
	/**
	 * ��ť����
	 */
	private String name;
	/**
	 * ���{@link #name}��ֵ
	 * @return ��Ա����name (�������� String)
	 */
	public String getName() {
		return name;
	}

	/**
	 * ���ó�Ա����{@link #name}��ֵ
	 * @param name ��Ա���� (�������� String)
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
