import java.sql.*;
import java.util.*;

public class jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException {
  
		   try
		   {
			   Scanner s= new Scanner(System.in);
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			
			   PreparedStatement ps=c.prepareStatement("Insert into GNANI.DEPT values(?,?,?)");
			   ps.setInt(1,s.nextInt());
			   ps.setString(2,s.next());
			   ps.setString(3,s.next());
			   int coutn=ps.executeUpdate();
			 /*  while(rs.next())
				   {
				     System.out.println("Deptno : "+rs.getInt(1)+" "+"DNAME :"+rs.getString(2));
				   }*/
			//   System.out.println(count+"Rows Inserted");
			   
		   }
		   catch (SQLException e)
		   {
			   System.out.println(e);
		   }
		 
	}

}
