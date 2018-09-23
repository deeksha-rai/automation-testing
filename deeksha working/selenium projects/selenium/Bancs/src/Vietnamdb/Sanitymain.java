package Vietnamdb;
import org.openqa.selenium.WebDriver;

import Vietnam.Auth_Rem_india;

public class Sanitymain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	Create c =new Create();
	
	WebDriver driver = c.LogInrepair();
	c.forexFCYRepair(driver, 0);
	
}
}