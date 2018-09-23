package tesScenarios;

import commonMethods.Commonmeths;
import pagesofwebsite.LandingPage;
import utilities.ConstantValues;

public class TS001 {

	public static void ts1() throws Exception {
				
				Commonmeths.selectBrowser(ConstantValues.browserType);
				Commonmeths.openURL(ConstantValues.websiteURL);
				// Landing page
				LandingPage.membershiplink("membershiplink");
				LandingPage.joinLink("joinlink");
	}
}
