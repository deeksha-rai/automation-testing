
package taiwan;

import java.io.File;
import java.util.concurrent.TimeUnit;


//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main_BULK_BT_mdmc  {
	public static void main(String args[]) throws InterruptedException{
		Bancs_login BL = new Bancs_login();
		WebDriver WD1 = BL.login_screen("RPSTaipei19","P@ssw0rd");
		//CT_Rem_BEN  CBT=new CT_Rem_BEN();
		Create_BT_BULK_mdmc  CBT=new Create_BT_BULK_mdmc();
	//	Create_BOBT  CBT=new Create_BOBT();
	String CR_id = CBT.createBTBULKmdmc(WD1, "314");
	Auth_BT_BULK ABT=new Auth_BT_BULK ();
		 WebDriver WD2 = BL.login_screen("RPSTaipei29","P@ssw0rd");
		 ABT.authBTBULK(WD2,CR_id);
		// ABT.authCTBT(WD2);
	}
}
