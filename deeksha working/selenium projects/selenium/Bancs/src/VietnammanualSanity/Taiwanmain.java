package VietnammanualSanity;

import org.openqa.selenium.WebDriver;

import VietnammanualSanity.Taiwanmanual;
import VietnammanualSanity.Taiwanauth;


public class Taiwanmain {

	public static void main(String[] args) throws InterruptedException {
	Taiwanmanual abc=new Taiwanmanual();
	abc.Create_REM();

	Taiwanauth abcd= new Taiwanauth();
	WebDriver driver = abcd.LogInauthunitary();	
	abcd.AuthRem(driver, abc.RemId1,0);
	abcd.AuthRem(driver, abc.RemId4,2);
     abcd.AuthRem(driver, abc.RemId7,4);

	WebDriver driver2 = abcd.LogInauthbulk();	
	abcd.Authorder(driver2,abc.RemId2,0);
	abcd.Authorder(driver2,abc.RemId3,2);
	abcd.Authorder(driver2,abc.RemId5,4);
	abcd.Authorder(driver2,abc.RemId6,6);
	
	
	
	
	
	}

}
