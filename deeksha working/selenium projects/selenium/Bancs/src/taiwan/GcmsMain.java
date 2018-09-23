package taiwan;

import org.openqa.selenium.WebDriver;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class GcmsMain {

	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException {
		Bancs_login BL = new Bancs_login();
		WebDriver WD2 = BL.login_screen("RPSTaipei16","P@ssw0rd");
		channelselectiongcms ab= new channelselectiongcms();
		ab.fileupload(WD2);
		Thread.sleep(10000);
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
	WebDriver WD1= BL.login_screen("RPSTaipei30","tcs@123");
	FileRealease ba=new FileRealease();
	
   ba.fr(WD1);
   Wizard wz1= new Wizard();
   wz1.abc(WD1);
   Ordersummary or1= new Ordersummary();
   or1.os(WD1);
   wz1.abc(WD1);
   Auth_ordermaster ct1= new  Auth_ordermaster();
   ct1.ctod(WD1);
   wz1.abc(WD1);
  Auth_workitem wd1= new Auth_workitem();
wd1.wid1(WD1);
    

	}

	}

