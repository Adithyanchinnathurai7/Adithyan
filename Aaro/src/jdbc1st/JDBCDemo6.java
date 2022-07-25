package jdbc1st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBCDemo6 
{

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/qic","root","Root");
		
		System.out.println(co);
		
		String sql="select*from users where uname=?";
		PreparedStatement stat=co.prepareStatement(sql);
		while(true)
		{
		stat.setString(1,"adi");
		//stat.setString(2,"aji");
		
		ResultSet rs=stat.executeQuery();
		
		ResultSetMetaData rsmd=rs.getMetaData();
		int cocount=rsmd.getColumnCount();
		
		for(int i=1;i<=cocount;i++)
		{
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println();
		if(rs.next())
		{
			for(int i=1;i<=cocount;i++)
			{
				System.out.print(rs.getString(i)+"\t");
			}
		}
		}		
	}
}
