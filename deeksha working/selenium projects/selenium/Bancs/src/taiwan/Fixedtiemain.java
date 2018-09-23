package taiwan;
import org.openqa.selenium.WebDriver;

public class Fixedtiemain {

	public static void main(String[] args) throws InterruptedException {
		Bancs_login BL = new Bancs_login();
		WebDriver WD2 = BL.login_screen("RPSTaipei16","P@ssw0rd");
		Channelselectionfixtie ab= new 	Channelselectionfixtie();
		ab.fileupload(WD2);
	}

	}

