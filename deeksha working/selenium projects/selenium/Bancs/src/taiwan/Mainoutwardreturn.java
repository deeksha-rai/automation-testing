package taiwan;
import org.openqa.selenium.WebDriver;
public class Mainoutwardreturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chromelogin BL = new Chromelogin();
		//WebDriver WD1 = BL.login_screen("renukatm","verma5");
	//	Outwardreturn ab = new Outwardreturn();
		//ab.Nackoutward(WD1);
		WebDriver WD2 = BL.login_screen("renukatc","verma5");
		Authotwardreturn abc= new Authotwardreturn();
		abc.AuthNackoutward(WD2);
		

	}

}
