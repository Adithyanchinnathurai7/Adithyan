package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.ConstructorParameters;



public class JDBCBlop 
{
	
	public static void main(String[] args) 
	{
		
		DataCon dc=new DataCon();
		dc.image();
	
		
	}

}
class DataCon
{
	public DataCon() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
	}
	public void image() 
	{
		try {
			Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "Root");
			System.out.println("Connection established......");
			
			 String query = "insert into mydata(name,logo) values (?, ?,)";
		     PreparedStatement pstmt = com.prepareStatement(query);
		     pstmt.setString(1, "JavaFX");     
		     InputStream inputStream = new FileInputStream("C:\\Users\\adithyan.c\\image\\car.jfif");
		     pstmt.setBlob(2, inputStream);
		     pstmt.execute();
		     
		     System.out.println("Record inserted......");
			
			
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
}
