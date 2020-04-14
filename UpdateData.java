package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateData 
{
		   public void update()
		    {
		    	try
		    	{
		    	   Class.forName("org.h2.Driver");
		    	   Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","KARTHIK","Karthik@04");
		    	   Statement st=con.createStatement();
		    	   String sql="update student set marks=99 where marks=35";
		    	   int i=st.executeUpdate(sql);
		    	   if(i>0)
		    	   {
		    		   System.out.println("row updated");
		    	   }
		    	}
		    	catch(ClassNotFoundException | SQLException  c)
		    	{
		    		System.out.println(c);
		    	}
	}

			public static void main(String[] args) 
			{
				 UpdateData u=new  UpdateData ();
		       u.update();
			}

}
