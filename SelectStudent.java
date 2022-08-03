import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectStudent {
public static void main(String[] args) throws StudentNotFoundException  {
	
	try {
		System.out.println("Registering Driver...");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver registered..");
		
		System.out.println("Trying to connect to the db..");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
		 System.out.println("Conected to the DB: "+conn);
		 
		 System.out.println("Tryin to make a statement: ");
		Statement statement =conn.createStatement();
		 System.out.println("statement created: "+statement);
		 
		 System.out.println("Trying to execute the statement");
		 System.out.println("Enter roll no to view details:  ");
		 Scanner scan = new Scanner(System.in);	
		 int rolln = 0;
		 rolln = scan.nextInt();
		 System.out.println(rolln);
			

		 ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT WHERE ROLLNO="+rolln);
		 System.out.println("Statement executed, got the result");
			
			
			if (rs.next()) {
				
				 int rollno = rs.getInt(1);
				 String sname = rs.getString(2);
				 String dob =rs.getString(3);
				 int phy = rs.getInt(4);
				 int chem = rs.getInt(5);
				 int maths =rs.getInt(6);
				 int total = rs.getInt(7);
				 String grade =rs.getString(8);
				 System.out.println("ROLL NO    :"+rollno);
				 System.out.println("STUDENT NAME  :"+sname);
				 System.out.println("STUDENT DOB   :"+dob);
				 System.out.println("PHYSICS   :"+phy);
				 System.out.println("CHEMISTRY   :"+chem);
				 System.out.println("MATHS   :"+maths);
				 System.out.println("Total   :"+total);
				 System.out.println("Grade   :"+grade);

				 System.out.println("----------------------");
			 }
			 else {
				 throw new StudentNotFoundException(rolln+" Employee Not Found.");
				 
			 }
	
			 
			 rs.close();
			 statement.close();
			 conn.close();
			
	}
	catch (SQLException e) 
	{
		e.printStackTrace();		 
	}
}

}
