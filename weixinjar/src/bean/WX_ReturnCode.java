package bean;

import util.WX_Static;

/**
 * 
 * �ӿڷ�����
 * @author YanFuzhong
 * @date 2015-9-29 ����09:34:28
 * @version
 */
public class WX_ReturnCode {
	/**
	 * ������
	 */
	private String errcode;
	/**
	 * �������˵��
	 */
	private String errmsg;
	/**
	 * ����������˵��
	 */
	private String foreignErrmsg;
	/**
	 * ���{@link #errcode}��ֵ
	 * @return ��Ա����errcode (�������� String)
	 */
	public String getErrcode() {
		return errcode;
	}
	/**
	 * ���{@link #errmsg}��ֵ
	 * @return ��Ա����errmsg (�������� String)
	 */
	public String getErrmsg() {
		return errmsg;
	}
	/**
	 * ���ó�Ա����{@link #errcode}��ֵ
	 * @param errcode ��Ա���� (�������� String)
	 */
	public void setErrcode(String errcode) {
		this.errcode = errcode;
		setForeignErrmsg(WX_Static.RETURNCODE_MANAGER.getValue(errcode));
	}
	/**
	 * ���ó�Ա����{@link #errmsg}��ֵ
	 * @param errmsg ��Ա���� (�������� String)
	 */
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	/**
	 * ���{@link #foreignErrmsg}��ֵ
	 * @return ��Ա����foreignErrmsg (�������� String)
	 */
	public String getForeignErrmsg() {
		return foreignErrmsg;
	}
	/**
	 * ���ó�Ա����{@link #foreignErrmsg}��ֵ
	 * @param foreignErrmsg ��Ա���� (�������� String)
	 */
	public void setForeignErrmsg(String foreignErrmsg) {
		this.foreignErrmsg = foreignErrmsg;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_ReturnCode [errcode=" + errcode + ", errmsg=" + errmsg
				+ ", foreignErrmsg=" + foreignErrmsg + "]";
	}
}
