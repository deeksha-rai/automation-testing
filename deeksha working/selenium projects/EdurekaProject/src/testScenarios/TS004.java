package testScenarios;

import Utilities.ConstantValues;
import pagesOfWebsite.MakePayment;

public class TS004 {
	public static void ts004() throws Exception
	{
		MakePayment.EnterFirstName("Fname", ConstantValues.Fname);
		MakePayment.EnterLastName("Lname", ConstantValues.Lname);
		MakePayment.SelectMealPreference("meal", ConstantValues.meal);
		MakePayment.SelectCardType("cardType", ConstantValues.cardType);
		MakePayment.EnterCardNumber("cardNumber", ConstantValues.cardNumber);
		MakePayment.EnterExpiryMonth("ExpMonth", ConstantValues.ExpMonth);
		MakePayment.EnterExpiryYear("ExpYear", ConstantValues.ExpYear);
		MakePayment.EnterFirstNameonCard("BillFirstName", ConstantValues.BillFirstName);
		MakePayment.EnterLastNameonCard("BillLastName", ConstantValues.BillLastName);
 		MakePayment.EnetrBillingAddress("BillAddress", ConstantValues.BillAddress);
		MakePayment.EnterBillingCity("BilCity", ConstantValues.BilCity);
		MakePayment.EnterBillingState("BilState", ConstantValues.BilState);
		MakePayment.EnetrBillingPostalCode("BilzipCode", ConstantValues.BilzipCode);
		MakePayment.SelectBillingCountry("BilCountry", ConstantValues.BilCountry);
		MakePayment.EnetrDeliveryAddress("DelAddress", ConstantValues.DelAddress);
		MakePayment.EnterDeliveryCity("DelCity", ConstantValues.DelCity);
		MakePayment.EnterDeliveryState("Delstate", ConstantValues.Delstate);
		MakePayment.EnetrDeliveryPostalCode("Delzipcode", ConstantValues.Delzipcode);
		MakePayment.SelectDeliveryCountry("DelCountry", ConstantValues.DelCountry);
		MakePayment.ClickOnSecurePurchase("SecurePurchase");
	}

}
