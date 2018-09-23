package testScenarios;

import pagesOfWebsite.SelectFlight;

public class TS003 {
public static void ts003() throws Exception
{
	SelectFlight.selectDepartFlight("DepartFlight");
	SelectFlight.selectDepartFlight("ReturnFlight");
	SelectFlight.selectDepartFlight("ContinueLink");
	
}
}
