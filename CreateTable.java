package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class CreateTable
{
    public void create()
    {
    	Statement st = null;
    	Connection con=null;
    	try
    	{
    	Class.forName("org.h2.Driver");
    	con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","karthik","Karthik@04");
    	if(con!=null)
    	{
    		 st=con.createStatement();
    		 String sql = "CREATE TABLE student1" +"(id INT not NULL, " +"name VARCHAR(25), " + "gender VARCHAR(255), " + " marks INT, " + " PRIMARY KEY ( id ))";
    		st.execute(sql);
    		 if(sql!=null)
    		   System.out.println("table created");
    		else
    			System.out.println("table not created");
    	}
    	else
    	{
    		System.out.println("error occured while connection");
    	}
    	con.close();
    	}
    	catch(ClassNotFoundException | SQLException e)
    	{
    		System.out.println(e);
    	}
}
public static void main(String[] args)
{
	CreateTable c=new CreateTable();
	c.create();
}}

