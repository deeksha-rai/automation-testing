package JDBCDemo;
import java.sql.*;

public class ConnectionSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {

	Connection conn=DriverManager.getConnection("jdbc:mysql:")
}
catch(Exception e)
{
e.printStackTrace();	
}
	}

}
