package pagesOfWebSite;


import supportProviderUtilities.CommonMeths;
import supportProviderUtilities.ConstantsDeclared;

public class LoginToSite {

	public static void clickOnLogin() throws Exception
	{
		CommonMeths.selectBrowser(ConstantsDeclared.browser);
		CommonMeths.openUrl(ConstantsDeclared.url);
	    CommonMeths.handlingClicks("LoginUser");
	}
	
	public static void enterDetails() throws Exception
	{ 
	
	Thread.sleep(2000);
	CommonMeths.handlingtextboxes("userName", ConstantsDeclared.userName);
	CommonMeths.handlingtextboxes("password", ConstantsDeclared.passowrd);
	CommonMeths.handlingClicks("login");
	
	}
}
