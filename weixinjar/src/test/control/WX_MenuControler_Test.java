package test.control;
import net.sf.json.JSONObject;
import bean.WX_APIToken;
import bean.menu.WX_ClickButton;
import bean.menu.WX_ComplexButton;
import bean.menu.WX_Menu;
import bean.menu.WX_ViewButton;
import util.WX_Static;
import control.WX_HttpsControler;
import control.WX_MenuControler;

public class WX_MenuControler_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_HttpsControler controler = new WX_HttpsControler();
		WX_APIToken apitoken = controler.getToken(WX_Static.devConfig.getAppID(), WX_Static.devConfig.getAppSecret());
		System.out.println(apitoken);
		WX_Menu menu= new WX_Menu();
		WX_ViewButton btn11 = new WX_ViewButton();
		btn11.setName("官网主页");
		btn11.setType("view");
		btn11.setUrl("http://www.ccniit.com");

		WX_ViewButton btn12 = new WX_ViewButton();
		btn12.setName("新闻动态");
		btn12.setType("view");
		btn12.setUrl("http://www.ccniit.com");

		WX_ViewButton btn13 = new WX_ViewButton();
		btn13.setName("招生");
		btn13.setType("view");
		btn13.setUrl("http://www.ccniit.com");

		WX_ViewButton btn21 = new WX_ViewButton();
		btn21.setName("计算机科学与技术系");
		btn21.setType("view");
		btn21.setUrl("http://www.ccniit.com");

		WX_ViewButton btn22 = new WX_ViewButton();
		btn22.setName("应用外语系");
		btn22.setType("view");
		btn22.setUrl("http://www.ccniit.com");

		WX_ViewButton btn31 = new WX_ViewButton();
		btn31.setName("校园导图");
		btn31.setType("view");
		btn31.setUrl("http://www.ccniit.com");

		WX_ClickButton btn32 = new WX_ClickButton();
		btn32.setName("后勤保障");
		btn32.setType("click");
		btn32.setKey("123");

		WX_ComplexButton mainBtn1 = new WX_ComplexButton();
		mainBtn1.setName("Neusoft");
		mainBtn1.getSub_button().add(btn11);
		mainBtn1.getSub_button().add(btn12);
		mainBtn1.getSub_button().add(btn13);

		WX_ComplexButton mainBtn2 = new WX_ComplexButton();
		mainBtn2.setName("院系");
		mainBtn2.getSub_button().add(btn21);
		mainBtn2.getSub_button().add(btn22);

		WX_ComplexButton mainBtn3 = new WX_ComplexButton();
		mainBtn3.setName("服务指南！");
		mainBtn3.getSub_button().add(btn31);
		mainBtn3.getSub_button().add(btn32);

		menu.getButton().add(mainBtn1);
		menu.getButton().add(mainBtn2);
		menu.getButton().add(mainBtn3);
		
		String info=JSONObject.fromObject(menu).toString();
		System.out.println(info);
		
		WX_MenuControler controler2 = new WX_MenuControler();
//		System.out.println(controler2.modify(menu));
		System.out.println(controler2.getAll().get(0));
		controler2.delete();
//		controler.httpsRequest(WX_API.CREATE_MENU.replace("ACCESS_TOKEN", apitoken.getAccess_token()), WX_Method_Util.POST, info);
//		controler.httpsRequest(WX_API.DELETE_MENU.replace("ACCESS_TOKEN", apitoken.getAccess_token()), WX_Method_Util.GET, null);
	}
}
