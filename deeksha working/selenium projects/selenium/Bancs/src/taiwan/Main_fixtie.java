package taiwan;

import org.openqa.selenium.WebDriver;

public class Main_fixtie {

	public static void main(String[] args) throws InterruptedException {
		
		Bancs_login BL = new Bancs_login();
		WebDriver WD2 = BL.login_screen("RPSTaipei16","P@ssw0rd");
		Channelselectionfixtie ab=new Channelselectionfixtie ();
		ab.fileupload(WD2);
		Thread.sleep(3000);
		FileRelease fa= new FileRelease();
		fa.fr(WD2);
	Wizard wz= new Wizard();
	wz.abc(WD2);
	Ordersummary or= new Ordersummary();
	or.os(WD2);
	wz.abc(WD2);
Ordermaster ct= new Ordermaster();
	ct.ctod(WD2);
	wz.abc(WD2);
	WorkitemDetails wd= new WorkitemDetails();
	wd.wid(WD2);
	WebDriver WD1= BL.login_screen("RPSTaipei29","P@ssw0rd");
	FileRealease ba=new FileRealease();
	
   ba.fr(WD1);

   wz.abc(WD1);

   or.os(WD1);
   wz.abc(WD1);
  
   ct.ctod(WD1);
   wz.abc(WD1);
  Auth_workitem wd1= new Auth_workitem();
wd1.wid1(WD1);
    



	}

}
