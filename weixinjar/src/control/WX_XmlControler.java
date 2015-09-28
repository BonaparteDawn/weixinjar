package control;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import util.WX_Static;

import bean.WX_Object;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
/**
 * XML和JAVA对象处理的控制器
 * @author YanFuzhong
 * @date 2015-9-24 下午10:08:54
 * @version 1.0
 */
public class WX_XmlControler  extends WX_Object{
	/**
	 * XML转对象
	 * @param xml
	 * @param class1
	 * @return Object
	 */
	public static Object xml2object(String xml,Class<?> class1){
		XStream xstream = new XStream(new DomDriver());
		Object res = null;
		if (xml != null && class1 !=null) {
			xstream.processAnnotations(class1);
			res = xstream.fromXML(xml);
		}
		return res;
	}
	/**
	 * 对象转XML
	 * @param object
	 * @return String
	 */
	public static String object2xml(Object object){
		XStream xstream = new XStream(new DomDriver());
		String res = null;
		if (object != null) {
			xstream.autodetectAnnotations(true);
			res = xstream.toXML(object);
		}
		return res;
	}
	/**
	 * 获得微信接口中&lt;xml&gt;&lt;/xml&gt;之间的标签的值
	 * @param xml
	 * @param name
	 * @return String
	 */
	public static String elementData(String xml,String name){
		String res =null;
		try {
			if (xml!=null) {
				Document document = DocumentHelper.parseText(xml);
				Element root=document.getRootElement();
				if (root!=null) {
					Element element = root.element(name);
					if (element !=null) {
						res = (String) element.getData();
					}
				}
			}
		} catch (DocumentException e) {
			WX_Static.log(WX_FileControler.class).error(e.getMessage());
		}
		return res;
	}

}