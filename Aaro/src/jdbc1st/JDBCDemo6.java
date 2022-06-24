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
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qic","root","Root");
		
		System.out.println(con);
		
		String sql="select * from users where uname=?";
		PreparedStatement sttm=con.prepareStatement(sql);
		
		sttm.setString(1, "abi");
		ResultSet rs =sttm.executeQuery();
		
		ResultSetMetaData rsm=rs.getMetaData();
		int colcount=rsm.getColumnCount();
		for(int i=1;i<=colcount;i++) {
			System.out.print(rsm.getColumnName(i)+"\t");
		}
		System.out.println("\n=====================================================\n");
		if(rs.next()) {
			for(int i=1;i<=colcount;i++) {
				System.out.print(rs.getString(i)+"\t");
			}
		}
	}
}
