
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

public class Main_REM_BULK_mdmc  {
	public static void main(String args[]) throws InterruptedException{
		Bancs_login BL = new Bancs_login();
		WebDriver WD1 = BL.login_screen("RPSTaipei19","P@ssw0rd");
		
		Create_REM_BULK_mdmc  CBT=new Create_REM_BULK_mdmc();
	String CR_id = CBT.createREMBULKmdmc(WD1, "314");
	    Auth_REM_BULK ABT=new Auth_REM_BULK ();
		 WebDriver WD2 = BL.login_screen("RPSTaipei29","P@ssw0rd");
		 ABT.authREMBULK(WD2,CR_id);
		// ABT.authCTBT(WD2);
	}
}
