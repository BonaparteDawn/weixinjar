package test.control;

import control.WX_FileProControler;

public class WX_FileProControler_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_FileProControler controler = new WX_FileProControler("returncode.properties");
		System.out.println(controler.getValue("-1"));;
	}
}
