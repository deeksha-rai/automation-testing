package taiwan;
import org.openqa.selenium.WebDriver;
public class Main_gcms_upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Chromelogin BL = new Chromelogin();
		
		WebDriver WD2 = BL.login_screen("renukatm","verma5");
		channelselectiongcms ab=new channelselectiongcms();
		ab.fileupload(WD2);
		Thread.sleep(6000);
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
		//Wizard wz= new Wizard();
	WebDriver WD1= BL.login_screen("renukatc","verma5");
	FileRealease ba=new FileRealease();
	
   ba.fr(WD1);
   
   wz.abc(WD1);
   Auth_Order_summary or1= new Auth_Order_summary();
   or1.osa(WD1);
   wz.abc(WD1);
  // Ordermaster ct= new Ordermaster();
   ct.ctod(WD1);
   wz.abc(WD1);
  Auth_workitem wd1= new Auth_workitem();
wd1.wid1(WD1);
    

	}


	}


