package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Jdbc
{
	public void connect()
	{
		try {
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/hari","sa","sa");
			if(con!=null)
			{
				System.out.println("connection successfull");
			}
			else
			{
				System.out.println("error");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	public static void main(String[] args)
	{
		Jdbc j=new Jdbc();
		j.connect();

	}

}
