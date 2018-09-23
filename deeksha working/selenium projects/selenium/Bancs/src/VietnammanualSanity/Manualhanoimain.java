package VietnammanualSanity;
import org.openqa.selenium.WebDriver;
public class Manualhanoimain {

	public static void main(String[] args) throws InterruptedException {
		Createhanoi afd = new Createhanoi();
		afd.Create_REM();
		Authhanoi mng = new  Authhanoi();
		WebDriver driver1 = mng.LogIn();
		mng.AuthRem(driver1,afd.RemId1, 0);
		mng.AuthRem(driver1,afd.RemId2, 2);
		WebDriver driver4 = mng.SologIn();
		mng.Authso(driver4,afd.RemId3, 0);

	}

}
