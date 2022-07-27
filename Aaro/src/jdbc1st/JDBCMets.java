package jdbc1st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMets {

	public static void main(String[] args) 
	{
		JDBCMets jdbc=new JDBCMets();
		//jdbc.createAndinsert();
		jdbc.upDate();
		
	}

	public JDBCMets() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createAndinsert() 
	{
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marvel", "root", "Root");
			
			
//		String mysql="create table avengers(rlno int,name varchar(20),work varchar(20))";
//		Statement stmt=con.createStatement();		
//		stmt.execute(mysql);
//		System.out.println("database created....");
		
			String sql = "insert into avengers(rlno, name, work) values(?, ?, ?)";
			PreparedStatement stmt1 = con.prepareStatement(sql);
			
			while (true) {
				Scanner gett = new Scanner(System.in);
				System.out.println("enter rolno:");
				int rno = gett.nextInt();
				System.out.println("enter name:");
				String name = gett.next();
				System.out.println("enter work:");
				String work = gett.next();

				stmt1.setInt(1, rno);
				stmt1.setString(2, name);
				stmt1.setString(3, work);
				stmt1.executeUpdate();
				System.out.println("values successfully inserted....");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void upDate() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marvel", "root", "Root");
			String mysql = "update members set name=? where work=?)";
			PreparedStatement stmt2 = con.prepareStatement(mysql);
			while (true) {
			Scanner gett = new Scanner(System.in);
			System.out.println("enter name:");
			String name = gett.next();
			System.out.println("enter work:");
			String work = gett.next();
			stmt2.setString(1, name);
			stmt2.setString(2, work);
			stmt2.execute();

			System.out.println("Updated....");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
