package pagesOfWebsite;

import commonMethods.Commonmeths;

public class ValidateCredentials {
	public static void clickOnUserIcon(String PropertyA)throws Exception
	{
		Commonmeths.handlingClicks(PropertyA);
		
	}
	public static String getCredentials(String PropertA)throws Exception
	{
		String username=Commonmeths.handlingtext(PropertA);
		return username;
	}
	public static void clickOnCompose(String PropertyA)throws Exception
	{
		Commonmeths.handlingClicks(PropertyA);
	}
	public static void enterEmailOfStakeHolder(String PropertyA)throws Exception
	{
		Commonmeths.handlingClicks(PropertyA);
	}
	public static void enetrTo(String PropertyA, String testdata)throws Exception
	{
		Commonmeths.handlingtextboxes(PropertyA, testdata);
	}
	public static void enetrSubject(String PropertyA, String testdata)throws Exception
	{
		Commonmeths.handlingtextboxes(PropertyA, testdata);
	}
	public static void clickOnAttachment(String PropertyA)throws Exception
	{
		Commonmeths.handlingClicks(PropertyA);
	}
	public static void clicktoSendEmail(String PropertyA)throws Exception
	{
		Commonmeths.handlingClicks(PropertyA);
	}
	

}
