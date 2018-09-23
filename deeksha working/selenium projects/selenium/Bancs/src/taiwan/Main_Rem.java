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

public class Main_Rem  {
	public static void main(String args[]) throws InterruptedException{
		Chromelogin BL = new Chromelogin();
		WebDriver WD1 = BL.login_screen("renukatm","verma5");
		Create_CT_Rem  CBT=new Create_CT_Rem();
		
	String CR_id = CBT.createCTRem(WD1);
	Auth_OR_unitary ABT=new Auth_OR_unitary();
	    //Auth_CT_BT ABT=new Auth_CT_BT ();
		 WebDriver WD2 = BL.login_screen("renukatc","verma5");
		 ABT.authCTBT(WD2,CR_id);
		
	}
}
