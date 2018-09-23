package taiwan;

import org.openqa.selenium.WebDriver;

public class Maincustomeragreement {

	public static void main(String[] args) {
		Bancs_login BL = new Bancs_login();
		WebDriver WD1 = BL.login_screen("RPSTaipei15","P@ssw0rd");
		Customeragreement ab =new Customeragreement();
		ab.Custagreement(WD1 );
		WebDriver WD2 = BL.login_screen("RPSTaipei29","P@ssw0rd");
		Authcustomeragreement abc =new Authcustomeragreement();
		abc.Authcustagreement(WD2);

	}

}
