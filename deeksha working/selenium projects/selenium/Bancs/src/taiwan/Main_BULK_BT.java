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

public class Main_BULK_BT  {
	public static void main(String args[]) throws InterruptedException{
		Chromelogin BL = new Chromelogin();
		WebDriver WD1 = BL.login_screen("renukatm","verma5");
		
		Create_BT_BULK  CBT=new Create_BT_BULK();
		//String CR_id = "10955";
	String CR_id = CBT.createBTBULK(WD1, "314");
	Auth_BT_BULK ABT=new Auth_BT_BULK ();
	WebDriver WD2 = BL.login_screen("renukatc","verma5");
		 //ABT.authBTBULK(WD2,CR_id);
		 
		 ABT.authBTBULK(WD2);
		
	}
}
