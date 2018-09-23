package driverScript;

import tesScenarios.TS001;
import tesScenarios.TS002;
import tesScenarios.TS003;
import utilities.ConstantValues;
import utilities.excelReadwrite;

public class Script {
	  
	  public static String runMOde;	
	  public static boolean bValue = true;
	  
	  public static void main(String[] args) throws Exception {
		
		excelReadwrite.setExcelpath(ConstantValues.excelPath);  
//-----------------------------------------------------------			
		runMOde = excelReadwrite.readValues("TestScenario", 1, 2);
		if (runMOde.equalsIgnoreCase("y")) {
			TS001.ts1();
			if (bValue == false) {
				excelReadwrite.writeToExcel("TestScenario", 1, 3, "FAIL");
			} else {
				excelReadwrite.writeToExcel("TestScenario", 1, 3, "PASS");
			}
		}
		else {
			System.out.println("TS001 is skipped");
		}
		
//-----------------------------------------------------------		
		runMOde = excelReadwrite.readValues("TestScenario", 2, 2);
		if (runMOde.equalsIgnoreCase("y")) {
			TS002.ts2();
			if (bValue == false) {
				excelReadwrite.writeToExcel("TestScenario", 2, 3, "FAIL");
			} else {
				excelReadwrite.writeToExcel("TestScenario", 2, 3, "PASS");
			}
		}
		else {
			System.out.println("TS002 is skipped");
		}
//-----------------------------------------------------------			
		runMOde = excelReadwrite.readValues("TestScenario", 3, 2);
		if (runMOde.equalsIgnoreCase("y")) {
			TS003.ts3();
			if (bValue == false) {
				excelReadwrite.writeToExcel("TestScenario", 3, 3, "FAIL");
			} else {
				excelReadwrite.writeToExcel("TestScenario", 3, 3, "PASS");
			}
		}
		else {
			System.out.println("TS003 is skipped");
		}
  	}
}
