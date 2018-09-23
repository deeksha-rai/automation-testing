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

public class Main_Bt_bulk_sendback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bancs_login BL = new Bancs_login();
		WebDriver WD1 = BL.login_screen("RPSTaipei16","P@ssw0rd");
		
		Create_BT_BULK_sendback ab= new Create_BT_BULK_sendback();
		String CR_id = ab.createBTBULKsendback(WD1, "314");
		 WebDriver WD2 = BL.login_screen("RPSTaipei30","tcs@123");
		 Auth_BULK_BT_sendback ABT= new Auth_BULK_BT_sendback();
		 ABT.authBULKBTsendback(WD2,CR_id);

	}

}
