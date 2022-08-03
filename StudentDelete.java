import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDelete {
public static void main(String[] args) throws  StudentNotFoundException {
	
	try {
		System.out.println("Registering Driver...");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver registered..");
		
		System.out.println("Trying to connect to the db..");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
		 System.out.println("Conected to the DB: "+conn);
		
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter roll number to delete: ");
			int rno = scan1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from student where rollno ="+rno);
			
			 if (rs.next()) {
				
					System.out.println("trying to make a Prepared statment");
					PreparedStatement pst = conn.prepareStatement("DELETE FROM STUDENT WHERE ROLLNO=?");
					System.out.println("Prepared Statement created : "+pst);
					pst.setInt(1, rno);
					System.out.println("Trying to execute the prepared statement....");
					int rows = pst.executeUpdate();
					
					System.out.println("Prepred Statement executed, deleted the records :..."+rows);
						
					
					pst.close();	conn.close();
					
				}
		
		 else {
				StudentNotFoundException ex = new StudentNotFoundException("This roll number does not exists : "+rno);
				throw ex;
			 }
			
	}
	catch (SQLException e) 
	{
		e.printStackTrace();		 
	}
}



}
/*class Sum{
	int a,b,c;

	public Sum(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	
	return a+b+c;
	
}*/

