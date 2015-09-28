package bean.massage.in.evt;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * �ϱ�����λ����Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����09:57:52
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_LocationEvent_IN  extends WX_BaseEvent_IN{
	/**
	 * ����λ��γ��
	 */
	private String Latitude;
	/**
	 * ����λ�þ���
	 */
	private String Longitude;
	/**
	 * ����λ�þ�ȷ��
	 */
	private String Precision;
	
	/**
	 * ���{@link #Latitude}��ֵ
	 * @return ��Ա����Latitude (�������� String)
	 */
	public String getLatitude() {
		return Latitude;
	}

	/**
	 * ���{@link #Longitude}��ֵ
	 * @return ��Ա����Longitude (�������� String)
	 */
	public String getLongitude() {
		return Longitude;
	}

	/**
	 * ���{@link #Precision}��ֵ
	 * @return ��Ա����Precision (�������� String)
	 */
	public String getPrecision() {
		return Precision;
	}

	/**
	 * ���ó�Ա����{@link #Latitude}��ֵ
	 * @param latitude ��Ա���� (�������� String)
	 */
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	/**
	 * ���ó�Ա����{@link #Longitude}��ֵ
	 * @param longitude ��Ա���� (�������� String)
	 */
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	/**
	 * ���ó�Ա����{@link #Precision}��ֵ
	 * @param precision ��Ա���� (�������� String)
	 */
	public void setPrecision(String precision) {
		Precision = precision;
	}

	@Override
	public String toString() {
		return "WX_LocationEvent_IN [Latitude=" + Latitude + ", Longitude="
				+ Longitude + ", Precision=" + Precision + "]";
	}
}
