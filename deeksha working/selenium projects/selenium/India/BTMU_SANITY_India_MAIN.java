import org.openqa.selenium.WebDriver;


public class BTMU_SANITY_India_MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CreateRem_ALL_BTMU_India rem = new CreateRem_ALL_BTMU_India();
		Auth_Rem auth = new Auth_Rem();
		rem.Create_REM();
		WebDriver driver = auth.LogIn();		
		auth.AuthRem(driver, rem.RemId1,0);
		auth.AuthRem(driver, rem.RemId2,2);
		auth.AuthRem(driver, rem.RemId7,4);
		auth.AuthRem(driver, rem.RemId8,6);	
		
		WebDriver dr = auth.LogIn_ORder();
		
		auth.Auth_Order(dr, rem.RemId3,0);
		auth.Auth_Order(dr, rem.RemId4,2);
		auth.Auth_Order(dr, rem.RemId5,4);
		auth.Auth_Order(dr, rem.RemId6,6);
		auth.Auth_Order(dr, rem.RemId9,8);
		auth.Auth_Order(dr, rem.RemId10,10);
		auth.Auth_Order(dr, rem.RemId11,12);
		auth.Auth_Order(dr, rem.RemId12,14);
			

	}

}
