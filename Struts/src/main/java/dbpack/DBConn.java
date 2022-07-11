package dbpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dtopack.UserDTO;



public class DBConn 
{
	public DBConn()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)	
		{
			e.printStackTrace();
		}
	}
	public boolean checkUser(String uname,String upass) 
	{
		try 
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","Root");
			PreparedStatement ps=con.prepareStatement("select*from users where uname=? and upass=?");
			ps.setString(1, uname);
			ps.setString(2, upass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch (Exception e) 
		
		{
			e.printStackTrace();
			return false;
		}
	}
		
		
		public boolean checkFlag(String uname) 
		{
			try 
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","Root");
				PreparedStatement ps=con.prepareStatement("select flag from users where uname=?");
				ps.setString(1, uname);
				
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
					int flag=rs.getInt(1);
					if(flag==0)
					{
						return true;
					}else
						
					{
						return false;
					}
				}          
				else
				{
					return false;
				}
								
			} catch (Exception e) 
			
			{
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean updateFlag(String uname,int flag) 
		{
			try 
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","Root");
				PreparedStatement ps=con.prepareStatement("update  users set flag=? where uname=?");
				ps.setInt(1, flag);
				ps.setString(2, uname);
				
				int i=ps.executeUpdate();
				if(i!=0)
				{
					return true;
				}
				else
				{
					return false;
				}
						
			} 
			catch (Exception e) 
			
			{
				e.printStackTrace();
				return false;
			}
		}
		public boolean registerUser(UserDTO user) 
		{
			try 
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","Root");
				PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?,?,?)");
				ps.setInt(1, user.getVid());
				ps.setString(2,user.getUname());
				ps.setString(3,user.getUpass());
				ps.setInt(4, user.getAmt());
				ps.setString(5,user.getCity());
				ps.setInt(6, user.getFlag());
				int i=ps.executeUpdate();
				if(i>0)
				{
					return true;
				}
				else
				{
					return false;
				}
				
			}
			catch (Exception e) 
			
			{
				e.printStackTrace();
				return false;
			}
		}
			
			public static void main(String[] args)
			{
				DBConn dbconn=new DBConn();
				//System.out.println(dbconn.checkUser("aji","secret"));
				System.out.println(dbconn.updateFlag("aji",0));
				//System.out.println(dbconn.checkFlag("aji"));
			}
	
}

