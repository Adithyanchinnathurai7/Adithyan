package jdbc1st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class JDBCDemo3 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qic","root","Root");
		
		System.out.println(con);
		
		String sql="update users set flag=? where  uid =?  ";
		PreparedStatement stat= con.prepareStatement(sql);
		stat.setInt(1,1);
		
		stat.setInt(2,8);
		int noofrowschanged=stat.executeUpdate();
		System.out.println("No of rows updated...:"+noofrowschanged);

	}

}
