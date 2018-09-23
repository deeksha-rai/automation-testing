package taiwan;
import org.openqa.selenium.WebDriver;
public class Main_ibrs_emergency {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Bancs_login BL = new Bancs_login();
		WebDriver WD2 = BL.login_screen("RPSTaipei16","P@ssw0rd");
		Ibrsemergency  ab= new 	Ibrsemergency();
		ab.fileupload(WD2);

	}

}
