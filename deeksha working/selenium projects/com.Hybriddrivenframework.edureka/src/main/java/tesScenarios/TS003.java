package tesScenarios;

import pagesofwebsite.AddressbookPage;
import utilities.ConstantValues;

public class TS003 {
	
	public static void ts3() throws Exception {
		// Address book page
		AddressbookPage.enterfirstName("firstName",ConstantValues.firstName);
		AddressbookPage.enterLastName("lastName",ConstantValues.lastName);
		AddressbookPage.enteruserName("userName",ConstantValues.userName);
		AddressbookPage.enterPassword("password",ConstantValues.password);
		AddressbookPage.enterconfirmPassword("confirmPassword",ConstantValues.confirmPassword); 
		AddressbookPage.enteremailid("emailid",ConstantValues.emailID);
		AddressbookPage.entercompanyname("companyname",ConstantValues.companyName);
		AddressbookPage.streetName("streetName",ConstantValues.streetName);
		AddressbookPage.cityName("cityName",ConstantValues.cityName);
		AddressbookPage.zipcode("zipcode",ConstantValues.zipCode);
		AddressbookPage.phone("phone",ConstantValues.phone);
		AddressbookPage.country("country",ConstantValues.country);
		AddressbookPage.state("state",ConstantValues.state);
		
	}

}
