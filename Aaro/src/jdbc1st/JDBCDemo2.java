package jdbc1st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo2
{

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qic","root","Root");
		System.out.println(con);
		//Step 3 - Execute sql statement
		String sql="update users set flag=0";
		Statement stat=con.createStatement();
		int noofrowschanged=stat.executeUpdate(sql);
		//step 4 - process result
		System.out.println("No of rows updated...:"+noofrowschanged);
		

	}

}
