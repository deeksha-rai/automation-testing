package pagesofwebsite;

import commonMethods.Commonmeths;

public class SignUpPage {
	public static void enterUsername(String propertyA,String testData) throws Exception
	{
		Commonmeths.handlingtextboxes(propertyA, testData);
	}

	public static void enterPassword(String propertyA,String testData) throws Exception
	{
		Commonmeths.handlingtextboxes(propertyA, testData);
	}public static void clickSignUpLink(String propertyA) throws Exception
	{
		Commonmeths.handlingClicks(propertyA);
	}
}
