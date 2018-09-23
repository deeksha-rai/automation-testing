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

public class Main_charge_modify  {
	public static void main(String args[]) throws InterruptedException{
		Bancs_login BL = new Bancs_login();
		WebDriver WD1 = BL.login_screen("RPSTaipei19","P@ssw0rd");
		//CT_Rem_BEN  CBT=new CT_Rem_BEN();
		charge_modify  CBT=new charge_modify();
	//	Create_BOBT  CBT=new Create_BOBT();
	String CR_id = CBT.chargemodify(WD1, "314");
	  
	  Auth_BEN ABT=new Auth_BEN ();
		 WebDriver WD2 = BL.login_screen("RPSTaipei29","P@ssw0rd");
		 ABT.authCTBT(WD2,CR_id);
	
	
	}
}
