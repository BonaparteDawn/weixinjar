package bean.massage.out.rsp;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * �ظ��ı���Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:07:27
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_TextMessage_OUT extends WX_BaseMessage_OUT {
	/**
	 * �ظ�����Ϣ����
	 */
	private String Content;
	/**
	 * ���{@link #Content}��ֵ
	 * @return ��Ա����Content (�������� String)
	 */
	public String getContent() {
		return Content;
	}


	/**
	 * ���ó�Ա����{@link #Content}��ֵ
	 * @param content ��Ա���� (�������� String)
	 */
	public void setContent(String content) {
		Content = content;
	}


	@Override
	public String toString() {
		return "WX_TextMessage_OUT [Content=" + Content + "]";
	}

	
}
