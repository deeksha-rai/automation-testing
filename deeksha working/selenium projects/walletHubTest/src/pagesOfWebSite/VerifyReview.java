package pagesOfWebSite;



import static org.testng.AssertJUnit.assertEquals;


import supportProviderUtilities.CommonMeths;
import supportProviderUtilities.ConstantsDeclared;

public class VerifyReview {
	
   public static void compareReviews()throws Exception
	{ 
		
		CommonMeths.handlinghoverwithoutclick("profile");
		CommonMeths.handlingClicks("selectprfl");
		CommonMeths.handlingClicks("viewReview");
		Thread.sleep(3000);
		String opinion=CommonMeths.returnStringValue("compare");
		assertEquals(ConstantsDeclared.review,opinion);
			
	}
   
}
