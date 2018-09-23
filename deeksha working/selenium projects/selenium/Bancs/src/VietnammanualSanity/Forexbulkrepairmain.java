package VietnammanualSanity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import VietnammanualSanity.Forexrepair;
public class Forexbulkrepairmain {

	public static void main(String[] args) throws SQLException {
	
		Forexrepair abc = new Forexrepair();
		
		 Connection conn = null;
		  
		  String columnValue= null;
	  try
	  
	  
	  
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");  
	  //PropertyFileRelatedFunctions propertyObject = new PropertyFileRelatedFunctions();
		  conn=DriverManager.getConnection(  
				  "jdbc:oracle:thin:@172.21.157.157:1521:ORCL","rippledb","rippledb_123");  
	 
String sql = "select mirn from automation"; 
	PreparedStatement stmt= conn.prepareStatement(sql); 
	ResultSet RemittanceId = stmt.executeQuery(sql);
	 
	  ResultSetMetaData rsmd = RemittanceId.getMetaData();
	  int columnsNumber = rsmd.getColumnCount();
	  WebDriver driver = abc.LogInbulkrepairhcm();
	  int j=0;
	  
	  while (RemittanceId.next()) {
	      for (int i = 1; i <= columnsNumber; i++) {
	          if (i > 1) System.out.print("||| ");
	           columnValue = RemittanceId.getString(i);
	          //String abc=String.parseInt(columnValue);
	           
	           
	           abc.forexFCYRepairbulk(driver, columnValue,j);
	           
	         
		          
	          System.out.print(columnValue + "--- " + rsmd.getColumnName(i));
	      }
	      System.out.println("|");
	  
	 j=j+2;
	  
	  }
	  
	  System.out.println("2nd loop");
	  RemittanceId = stmt.executeQuery(sql);
	 
	  rsmd = RemittanceId.getMetaData();
	  columnsNumber = rsmd.getColumnCount();
	  WebDriver driver1 = abc.LogInauthbulkhcm();
	  
	  j=0;
	  
	  while (RemittanceId.next()) {
	      for (int i = 1; i <= columnsNumber; i++) {
	          if (i > 1) System.out.print("||| ");
	           columnValue = RemittanceId.getString(i);
	          
	           
		          abc.Authorder(driver1, columnValue,j);
		        
	          System.out.print(columnValue + "--- " + rsmd.getColumnName(i));
	      }
	      System.out.println("|");
	  
	 j=j+2;
	  
	  }
	  }catch(Exception e)
	  {
		  
	  }
	  finally{
		  conn.close(); 
	  }
	  
	  }
}
	  
	  
	  
