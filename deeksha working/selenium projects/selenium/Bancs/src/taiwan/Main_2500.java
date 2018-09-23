package taiwan;
import org.openqa.selenium.WebDriver;



import taiwan.Login_Jenkins;
import taiwan.TCMS;


public class Main_2500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login_Jenkins BL = new Login_Jenkins();
		WebDriver WD1 = BL.login_screen("user1","user1");
		IBRS_STP ibrs = new IBRS_STP();
	    ibrs.createIBRS(WD1);

	}

}
