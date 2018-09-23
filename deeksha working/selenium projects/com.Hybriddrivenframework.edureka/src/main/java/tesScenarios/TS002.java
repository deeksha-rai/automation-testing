package tesScenarios;

import pagesofwebsite.MembershipPage;
import pagesofwebsite.ShoppingcartPage;

public class TS002 {
	
	public static void ts2() throws Exception {
				// Membership page
				MembershipPage.scrolling();
				MembershipPage.cartValue("cartValueonmembership");
				MembershipPage.joinNowButton("joinNowbutton");
				
				// Shopping Cart page
				ShoppingcartPage.totalPriceshoppingcart("totalprice_shoppingcart");
				ShoppingcartPage.createanaccount("createanaccount");
	}
}
