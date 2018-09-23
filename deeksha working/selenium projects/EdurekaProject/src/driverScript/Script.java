package driverScript;

import testScenarios.TS001;
import testScenarios.TS002;
import testScenarios.TS003;
import testScenarios.TS004;
import testScenarios.TS005;
import Utilities.ConstantValues;
import Utilities.excelReadwrite;

public class Script {	 
		  public static String runMOde;	
		  public static boolean bValue = true;
		  
		  public static void main(String[] args) throws Exception {
			
			excelReadwrite.setExcelPath(ConstantValues.excelPath);  
	//-----------------------------------------------------------			
			runMOde = excelReadwrite.readStringValues("TestScenario", 1, 2);
			if (runMOde.equalsIgnoreCase("y")) {
				System.out.println(runMOde);
				TS001.ts1();
				if (bValue == false) {
					excelReadwrite.writeValues("TestScenario", 1, 3, "FAIL");
				} else {
					excelReadwrite.writeValues("TestScenario", 1, 3, "PASS");
				}
			}
			else {
				System.out.println("TS001 is skipped");
			}
//	----------------------------------------------------------------------------------------
			runMOde = excelReadwrite.readStringValues("TestScenario", 2, 2);
			if (runMOde.equalsIgnoreCase("y")) {
				//System.out.println(runMOde);
				TS002.ts002();
				if (bValue == false) {
					excelReadwrite.writeValues("TestScenario", 2, 3, "FAIL");
				} else {
					excelReadwrite.writeValues("TestScenario", 2, 3, "PASS");
				}
			}
			else {
				System.out.println("TS002 is skipped");
			}
	//-----------------------------------------------------------------------------------------------
			runMOde = excelReadwrite.readStringValues("TestScenario", 3, 2);
			if (runMOde.equalsIgnoreCase("y")) {
				//System.out.println(runMOde);
				TS003.ts003();
				if (bValue == false) {
					excelReadwrite.writeValues("TestScenario", 3, 3, "FAIL");
				} else {
					excelReadwrite.writeValues("TestScenario", 3, 3, "PASS");
				}
			}
			else {
				System.out.println("TS003 is skipped");
			}
	//----------------------------------------------------------------------------------------------------		
			runMOde = excelReadwrite.readStringValues("TestScenario", 4, 2);
			if (runMOde.equalsIgnoreCase("y")) {
				//System.out.println(runMOde);
				TS004.ts004();
				if (bValue == false) {
					excelReadwrite.writeValues("TestScenario", 4, 3, "FAIL");
				} else {
					excelReadwrite.writeValues("TestScenario", 4, 3, "PASS");
				}
			}
			else {
				System.out.println("TS004 is skipped");
			}
	//-----------------------------------------------------------------------------------------------------------
			runMOde = excelReadwrite.readStringValues("TestScenario", 5, 2);
			if (runMOde.equalsIgnoreCase("y")) {
				//System.out.println(runMOde);
				TS005.ts005();
				if (bValue == false) {
					excelReadwrite.writeValues("TestScenario", 5, 3, "FAIL");
				} else {
					excelReadwrite.writeValues("TestScenario", 5, 3, "PASS");
				}
			}
			else {
				System.out.println("TS005 is skipped");
			}
	}

}
