
import java.sql.Connection;
import java.sql.DriverManager;

public class myDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con =null;
try
{
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser"+ " ","root","root");
if(con!=null)
{
	System.out.println("connected successfully");
}

}catch(Exception e)
{
	System.out.println("not connected database");
}
	}

}
