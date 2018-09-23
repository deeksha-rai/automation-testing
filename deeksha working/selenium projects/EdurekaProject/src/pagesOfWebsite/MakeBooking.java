package pagesOfWebsite;

import commonMethods.Commonmeths;

public class MakeBooking {
	public static void clickOnFlights(String PropertyA) throws Exception {
		Commonmeths.handlingClicks(PropertyA);
	}

	public static void selectTravelType(String PropertyA) throws Exception {
		Commonmeths.handlingClicks(PropertyA);
	}
	public static void selectNumberOfPassenger(String PropertyA, int testData) throws Exception {
		Commonmeths.handlingIntdropdowns(PropertyA, testData);
	}
	public static void selectDepartFrom(String PropertyA, String testData) throws Exception {
		Commonmeths.handlingdropdowns(PropertyA, testData);
	}
	public static void selectDepartMonth(String PropertyA, String testData) throws Exception {
		Commonmeths.handlingdropdowns(PropertyA, testData);
	}
	public static void selectDepartDate(String PropertyA, int testData) throws Exception {
		Commonmeths.handlingIntdropdowns(PropertyA, testData);
	}
	public static void selectArriveCity(String PropertyA, String testData) throws Exception {
		Commonmeths.handlingdropdowns(PropertyA, testData);
	}
	public static void selectReturnMonth(String PropertyA, String testData) throws Exception {
		Commonmeths.handlingdropdowns(PropertyA, testData);
		}
	public static void selectReturnDate(String PropertyA, int testData) throws Exception {
		Commonmeths.handlingIntdropdowns(PropertyA, testData);
	}
	public static void selectServiceClass(String PropertyA) throws Exception {
		Commonmeths.handlingClicks(PropertyA);
	}
	public static void clickContinue(String PropertyA) throws Exception {
		Commonmeths.handlingClicks(PropertyA);
	}
	

	
}
