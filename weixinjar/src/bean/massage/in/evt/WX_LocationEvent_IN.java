package bean.massage.in.evt;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 上报地理位置信息
 * @author YanFuzhong
 * @date 2015-9-24 下午09:57:52
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_LocationEvent_IN  extends WX_BaseEvent_IN{
	/**
	 * 地理位置纬度
	 */
	private String Latitude;
	/**
	 * 地理位置经度
	 */
	private String Longitude;
	/**
	 * 地理位置精确度
	 */
	private String Precision;
	
	/**
	 * 获得{@link #Latitude}的值
	 * @return 成员变量Latitude (数据类型 String)
	 */
	public String getLatitude() {
		return Latitude;
	}

	/**
	 * 获得{@link #Longitude}的值
	 * @return 成员变量Longitude (数据类型 String)
	 */
	public String getLongitude() {
		return Longitude;
	}

	/**
	 * 获得{@link #Precision}的值
	 * @return 成员变量Precision (数据类型 String)
	 */
	public String getPrecision() {
		return Precision;
	}

	/**
	 * 设置成员变量{@link #Latitude}的值
	 * @param latitude 成员变量 (数据类型 String)
	 */
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	/**
	 * 设置成员变量{@link #Longitude}的值
	 * @param longitude 成员变量 (数据类型 String)
	 */
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	/**
	 * 设置成员变量{@link #Precision}的值
	 * @param precision 成员变量 (数据类型 String)
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
