package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 地理位置消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:01:33
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_LocationMessage_IN  extends WX_BaseMessage_IN {
	/**
	 * 地理位置维度
	 */
	private String Location_X;
	/**
	 * 地理位置经度
	 */
	private String Location_Y;
	/**
	 * 地图缩放大小
	 */
	private String Scale;
	/**
	 * 地理位置信息
	 */
	private String Label;
	
	/**
	 * 获得{@link #Location_X}的值
	 * @return 成员变量Location_X (数据类型 String)
	 */
	public String getLocation_X() {
		return Location_X;
	}

	/**
	 * 获得{@link #Location_Y}的值
	 * @return 成员变量Location_Y (数据类型 String)
	 */
	public String getLocation_Y() {
		return Location_Y;
	}

	/**
	 * 获得{@link #Scale}的值
	 * @return 成员变量Scale (数据类型 String)
	 */
	public String getScale() {
		return Scale;
	}

	/**
	 * 获得{@link #Label}的值
	 * @return 成员变量Label (数据类型 String)
	 */
	public String getLabel() {
		return Label;
	}

	/**
	 * 设置成员变量{@link #Location_X}的值
	 * @param location_X 成员变量 (数据类型 String)
	 */
	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	/**
	 * 设置成员变量{@link #Location_Y}的值
	 * @param location_Y 成员变量 (数据类型 String)
	 */
	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}

	/**
	 * 设置成员变量{@link #Scale}的值
	 * @param scale 成员变量 (数据类型 String)
	 */
	public void setScale(String scale) {
		Scale = scale;
	}

	/**
	 * 设置成员变量{@link #Label}的值
	 * @param label 成员变量 (数据类型 String)
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
