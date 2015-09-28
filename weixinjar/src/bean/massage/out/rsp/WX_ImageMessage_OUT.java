package bean.massage.out.rsp;

import bean.massage.out.rsp.mb.WX_Image;

import com.thoughtworks.xstream.annotations.XStreamAlias;


/**
 * 回复的图片消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:06:25
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_ImageMessage_OUT extends WX_BaseMessage_OUT{
	/**
	 * 图片
	 */
	private WX_Image Image;
	
	/**
	 * 获得{@link #Image}的值
	 * @return 成员变量Image (数据类型 WX_Image)
	 */
	public WX_Image getImage() {
		return Image;
	}

	/**
	 * 设置成员变量{@link #Image}的值
	 * @param image 成员变量 (数据类型 WX_Image)
	 */
	public void setImage(WX_Image image) {
		Image = image;
	}

	@Override
	public String toString() {
		return "WX_ImageMessage_OUT [Image=" + Image + "]";
	}
	
}
