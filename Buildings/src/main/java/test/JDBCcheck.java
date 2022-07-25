package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCcheck {

	public JDBCcheck() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	
	}
	public static void main(String[] args) {
		 JDBCcheck ck=new  JDBCcheck();
		System.out.println(ck.checking("bem", "7-b"));
		
	}
	
public boolean checking(String name,String section) {
	
	try {
		Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "Root");
		
		String sql="select * from college where name=? and section=? ";
		PreparedStatement pre=com.prepareStatement(sql);
		pre.setString(1, name);
		pre.setString(2,section);
		ResultSet re=pre.executeQuery();
		
		if(re.next()) {
			return true;
		}
		else {
			return false;
		}
	} catch (Exception  e) {
		
		e.printStackTrace();
	}
	return false;
	
}
}


