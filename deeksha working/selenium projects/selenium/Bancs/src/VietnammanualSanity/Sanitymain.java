package VietnammanualSanity;
import org.openqa.selenium.WebDriver;
public class Sanitymain {

	
	public static void main(String[] args) throws InterruptedException {
		
		//For Hanoi
		//Createhanoi afd = new Createhanoi();
		//afd.Create_REM();
		//Authhanoi mng = new  Authhanoi();
		//WebDriver driver1 = mng.LogIn();
		//mng.AuthRem(driver1,afd.RemId1, 0);
		//mng.AuthRem(driver1,afd.RemId2, 2);
		//WebDriver driver4 = mng.SologIn();
		//mng.AuthRem(driver4,afd.RemId3, 0);
		
		//For HCM
		
		CreateManual abc =new CreateManual();
		abc.Create_REM();
		
		Authorisemanual abcd= new Authorisemanual();
		WebDriver driver = abcd.LogIn();	
		abcd.AuthRem(driver, abc.RemId1,0);
		abcd.AuthRem(driver, abc.RemId2,2);
         abcd.AuthRem(driver, abc.RemId3,4);
	abcd.AuthRem(driver, abc.RemId4,6);
		WebDriver driver2 = abcd.SologIn();	
		abcd.Authso(driver2,abc.RemId5,0);
	   
		
		
	}
	
	
	
}
