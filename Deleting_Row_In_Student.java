package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Deleting_Row_In_Student 
{
	public void delete()
	{
		try
		{
		  Class.forName("org.h2.Driver");
		  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/student","sa","sa");
		  Statement st=con.createStatement();
		  String sql="delete from student where marks=99";
		  int i=st.executeUpdate(sql);
		  if(i>0)
		  {
			  System.out.println("row deleted");
		  }
        }
		catch(ClassNotFoundException | SQLException  c)
		{
			System.out.println(c);
		}
	}
 
	public static void main(String[] args)
	{
		Deleting_Row_In_Student d=new Deleting_Row_In_Student();
		d.delete();
	}

}
