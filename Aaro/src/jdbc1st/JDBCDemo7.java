package jdbc1st;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JDBCDemo7 
{

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cnt=DriverManager.getConnection("jdbc:mysql://localhost:3306/qic","root","Root");
		System.out.println(cnt);
		
		
		 String sql= "{ call pro3(?,?)}";
		 
		 CallableStatement cs=cnt.prepareCall(sql);
		 cs.setString(1, "abi");
		 cs.registerOutParameter(2, Types.INTEGER);
		 cs.execute();
		 
		 int flag=cs.getInt(2);
		 System.out.println("Flag status:"+flag);
	}

}
