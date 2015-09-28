package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * �ı���Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:01:57
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_TextMessage_IN extends WX_BaseMessage_IN{
	/**
	 * ��Ϣ����
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
		return "WX_TextMessage_IN [Content=" + Content + "]";
	}
}
