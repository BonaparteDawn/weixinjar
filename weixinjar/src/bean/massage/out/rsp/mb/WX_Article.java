package bean.massage.out.rsp.mb;

import bean.WX_Object;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 图文模型
 * @author YanFuzhong
 * @date 2015-9-24 下午10:02:55
 * @version 1.0
 */
@XStreamAlias(value = "item")
public class WX_Article  extends WX_Object{
	/**
	 * 图文消息的名称
	 */
	private String Title;
	/**
	 * 图文消息描述
	 */
	private String Description;
	/**
	 * 图片链接 (支持JPG\PNG,较好的效果的大图640*320像素，小图80*80像素)
	 */
	private String PicUrl;
	/**
	 * 点击图文消息的跳转链接
	 */
	private String Url;
	
	/**
	 * 获得{@link #Title}的值
	 * @return 成员变量Title (数据类型 String)
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * 获得{@link #Description}的值
	 * @return 成员变量Description (数据类型 String)
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * 获得{@link #PicUrl}的值
	 * @return 成员变量PicUrl (数据类型 String)
	 */
	public String getPicUrl() {
		return PicUrl;
	}

	/**
	 * 获得{@link #Url}的值
	 * @return 成员变量Url (数据类型 String)
	 */
	public String getUrl() {
		return Url;
	}

	/**
	 * 设置成员变量{@link #Title}的值
	 * @param title 成员变量 (数据类型 String)
	 */
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * 设置成员变量{@link #Description}的值
	 * @param description 成员变量 (数据类型 String)
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * 设置成员变量{@link #PicUrl}的值
	 * @param picUrl 成员变量 (数据类型 String)
	 */
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	/**
	 * 设置成员变量{@link #Url}的值
	 * @param url 成员变量 (数据类型 String)
	 */
	public void setUrl(String url) {
		Url = url;
	}

	@Override
	public String toString() {
		return "WX_Article [Title=" + Title + ", Description=" + Description
				+ ", PicUrl=" + PicUrl + ", Url=" + Url + "]";
	}
	
}
