package walletHubReviewCheck;

public class MainClass {

	public static void main(String[] args) {
		BrowserSelection bs=new BrowserSelection();
		
		//Provide values in excel
		try {
			bs.OpenBrowser("chrome");
		 
		bs.openUrl("https://wallethub.com/profile/test_insurance_company/");
		System.out.println(3);
		LoginToSite.clickOnLogin();
		LoginToSite.enterDetails("glimpse.boon@gmail.com", "Deeksh@123");
		HoverOverStars.hoveronstars();
		String str=WriteAReviewTest.selectHealth();
		VerifyReview.goToProfile();
		VerifyReview.compareReviews(str);
	}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
