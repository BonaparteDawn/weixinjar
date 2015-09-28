package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ����λ����Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:01:33
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_LocationMessage_IN  extends WX_BaseMessage_IN {
	/**
	 * ����λ��ά��
	 */
	private String Location_X;
	/**
	 * ����λ�þ���
	 */
	private String Location_Y;
	/**
	 * ��ͼ���Ŵ�С
	 */
	private String Scale;
	/**
	 * ����λ����Ϣ
	 */
	private String Label;
	
	/**
	 * ���{@link #Location_X}��ֵ
	 * @return ��Ա����Location_X (�������� String)
	 */
	public String getLocation_X() {
		return Location_X;
	}

	/**
	 * ���{@link #Location_Y}��ֵ
	 * @return ��Ա����Location_Y (�������� String)
	 */
	public String getLocation_Y() {
		return Location_Y;
	}

	/**
	 * ���{@link #Scale}��ֵ
	 * @return ��Ա����Scale (�������� String)
	 */
	public String getScale() {
		return Scale;
	}

	/**
	 * ���{@link #Label}��ֵ
	 * @return ��Ա����Label (�������� String)
	 */
	public String getLabel() {
		return Label;
	}

	/**
	 * ���ó�Ա����{@link #Location_X}��ֵ
	 * @param location_X ��Ա���� (�������� String)
	 */
	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	/**
	 * ���ó�Ա����{@link #Location_Y}��ֵ
	 * @param location_Y ��Ա���� (�������� String)
	 */
	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}

	/**
	 * ���ó�Ա����{@link #Scale}��ֵ
	 * @param scale ��Ա���� (�������� String)
	 */
	public void setScale(String scale) {
		Scale = scale;
	}

	/**
	 * ���ó�Ա����{@link #Label}��ֵ
	 * @param label ��Ա���� (�������� String)
	 */
	public void setLabel(String label) {
		Label = label;
	}

	@Override
	public String toString() {
		return "WX_LocationMessage_IN [Location_X=" + Location_X
				+ ", Location_Y=" + Location_Y + ", Scale=" + Scale
				+ ", Label=" + Label + "]";
	}
}
