package taiwan;

import org.openqa.selenium.WebDriver;

public class Mainpostscript {

	
		public static void main(String args[]) throws InterruptedException{
			Chromelogin BL = new Chromelogin();
			WebDriver WD1 = BL.login_screen("renukatm","verma5");
			Postscript ab = new Postscript();
			ab.Createpostscript(WD1);
			 WebDriver WD2 = BL.login_screen("renukatc","verma5");
			 Authpostcript abcd =new  Authpostcript();
			 abcd.Authpostscriptabc(WD2);

	}

}
