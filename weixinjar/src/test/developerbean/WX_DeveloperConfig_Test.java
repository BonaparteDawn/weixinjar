package test.developerbean;
import bean.WX_DeveloperConfig;
import control.WX_FileControler;
import control.WX_XmlControler;
public class WX_DeveloperConfig_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_DeveloperConfig config = new WX_DeveloperConfig();
		config.setAppID("wx383113001e0a4d17");
		config.setAppSecret("6ba59c24346597eafd251d454bbb0d2e");
		config.setEncodingAESKey("gPVQVZfmbExeFMu0EF2BUcRhE54axNLqbjzZBTX1NVH");
		config.setOriginalId("gh_f8d891e5cc07");
		config.setToken("weixinCourse");
		config.setWeChatName("yfzapp");
		config.setWeChatNumber("yfzapp");
		System.out.println(WX_XmlControler.object2xml(config));
		WX_FileControler.writeToFile("dvpconfig.xml", WX_XmlControler.object2xml(config));
		System.out.println(WX_FileControler.readFromFile("dvpconfig.xml"));
		System.out.println(WX_XmlControler.xml2object(WX_FileControler.readFromFile("dvpconfig.xml"), WX_DeveloperConfig.class));
		System.out.println(WX_FileControler.class.getClassLoader().getResource(""));
	}
}
