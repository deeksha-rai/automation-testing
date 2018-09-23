package pagesOfWebsite;

import commonMethods.Commonmeths;

public class SignInToGmail {

	public static void openGmailSite(String PropertyA) throws Exception {
		Commonmeths.openWebsite(PropertyA);
}
	public static void enterEmail(String PropertyA,String testData) throws Exception {
		Commonmeths.handlingtextboxes(PropertyA, testData);
	}
	public static void clickOnNextButton(String PropertyA) throws Exception {
		Commonmeths.handlingClicks(PropertyA);
	}
	public static void enetrPassword(String PropertyA,String testData)throws Exception {
		Commonmeths.handlingtextboxes(PropertyA, testData);
	}
	public static void clickOnSubmitButton(String PropertyA)throws Exception {
		Commonmeths.handlingClicks(PropertyA);
		
	}
}