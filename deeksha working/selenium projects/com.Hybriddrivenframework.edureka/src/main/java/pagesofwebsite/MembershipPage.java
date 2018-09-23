package pagesofwebsite;

import commonMethods.Commonmeths;

public class MembershipPage {
	public static void cartValue(String propertyA) throws Exception {
		Commonmeths.fetchValue(propertyA);
  	}
  	
  	public static void joinNowButton(String propertyA) throws Exception {
  		Commonmeths.handlingClicks(propertyA);
  	}
  	
  	public static void scrolling() {
  		Commonmeths.scrolling();
  	}
}
