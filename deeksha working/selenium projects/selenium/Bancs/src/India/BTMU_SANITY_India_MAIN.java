package India;

import org.openqa.selenium.WebDriver;


public class BTMU_SANITY_India_MAIN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		CreateRem_ALL_BTMU_India rem = new CreateRem_ALL_BTMU_India();
		Auth_Rem_india auth = new Auth_Rem_india();
		rem.Create_REM();
		WebDriver driver = auth.LogIn();	
		
		
		auth.AuthRem(driver, rem.RemId1);
	auth.AuthRem(driver, rem.RemId2);
		auth.AuthRem(driver, rem.RemId7);
		auth.AuthRem(driver, rem.RemId8);	
		
		WebDriver dr = auth.LogIn_ORder();
		
		auth.Auth_Order(dr, rem.RemId3);
		auth.Auth_Order(dr, rem.RemId4);
		auth.Auth_Order(dr, rem.RemId5);
	auth.Auth_Order(dr, rem.RemId6);
		auth.Auth_Order(dr, rem.RemId9);
	auth.Auth_Order(dr, rem.RemId10);
		auth.Auth_Order(dr, rem.RemId11);
		auth.Auth_Order(dr, rem.RemId12);
			

	}

}
