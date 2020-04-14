package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class StudentExample1 
{
	public void multipleLines()
	{
		Scanner s=new Scanner(System.in);
		String name=null,gender=null,city=null;
		int marks=0;
		String sql=null;
		try {
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/hari","sa","sa");
			Statement st=con.createStatement();
			System.out.println("how many rows do you want insert");
			int n=s.nextInt();
			int i=1;
			while(i<=1)
			{
				System.out.println("enter name");
				name=s.nextLine();
				System.out.println("enter marks");
				marks=s.nextInt();
				System.out.println("enter gender");
				gender=s.nextLine();
				System.out.println("enter city");
				city=s.nextLine();
				sql="insert into student values('"+name+"','"+marks+"','"+gender+"','"+city+"')";
				st.executeUpdate(sql);
				System.out.println("row inserted");
				i++;
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args)
	{
		StudentExample1 m=new StudentExample1();
		m.multipleLines();

	}

}
