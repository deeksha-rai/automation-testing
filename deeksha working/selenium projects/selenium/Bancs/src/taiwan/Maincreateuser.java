package taiwan;

import org.openqa.selenium.WebDriver;

public class Maincreateuser {

	public static void main(String[] args) {
		Bancs_login BL = new Bancs_login();
		WebDriver WD1 = BL.login_screen("SYSADMIN","abcd1234");

Createuser ab=new Createuser();
ab.authCTBT(WD1);
	}

}
