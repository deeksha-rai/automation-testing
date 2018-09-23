package testScenarios;

import Utilities.ConstantValues;
import pagesOfWebsite.MakeBooking;

public class TS002 {
	public static void ts002() throws Exception
	{
		MakeBooking.clickOnFlights("Flights");
		MakeBooking.selectTravelType("OneWay");
		MakeBooking.selectNumberOfPassenger("NoOfPassenger",ConstantValues.NoOfPassenger);
		MakeBooking.selectDepartFrom("DepartFrom",ConstantValues.DepartFrom);
		MakeBooking.selectDepartMonth("DepartMonth",ConstantValues.DepartMonth);
		MakeBooking.selectDepartDate("DepartDate",ConstantValues.DepartDate);
		MakeBooking.selectArriveCity("ArriveCity",ConstantValues.ArriveCity);
		MakeBooking.selectReturnMonth("ReturnMonth",ConstantValues.ReturnMonth);
		MakeBooking.selectReturnDate("ReturnDate",ConstantValues.ReturnDate);
		MakeBooking.selectServiceClass("ServiceClass");
		MakeBooking.clickContinue("ContinueClick");
		
	}

}
