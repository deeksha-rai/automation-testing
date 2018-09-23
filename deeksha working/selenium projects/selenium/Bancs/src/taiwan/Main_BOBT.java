
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

public class Main_BOBT  {
	public static void main(String args[]) throws InterruptedException{
		Bancs_login BL = new Bancs_login();
		WebDriver WD1 = BL.login_screen("RPSTaipei15","P@ssw0rd");
	//	CT_Rem_BEN  CBT=new CT_Rem_BEN();
	//	Create_BT  CBT=new Create_BT();
		Create_BOBT  CBT=new Create_BOBT();
	String CR_id = CBT.createBT(WD1, "314");
	Auth_BOBT ABT=new Auth_BOBT ();
		 WebDriver WD2 = BL.login_screen("RPSTaipei30","P@ssw0rd");
		 ABT.authCTBT(WD2,CR_id);
		// ABT.authCTBT(WD2);
	}
}
