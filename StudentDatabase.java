import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDatabase {
public static void main(String[] args) throws StudentAlreadyExistsException {
	
	try {
		System.out.println("Registering Driver...");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver registered..");
		
		System.out.println("Trying to connect to the db..");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
		 System.out.println("Conected to the DB: "+conn);
		
		 System.out.println("Tryin to make a statement: ");
		 System.out.println("trying to make a Prepared statment");
			PreparedStatement pst = conn.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?,?,?,?,?);");
			System.out.println("Prepared Statement created : "+pst);
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter roll number : ");
			int rno = scan1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from student where rollno ="+rno);
			
			 if (rs.next()) {
				 StudentAlreadyExistsException ex = new StudentAlreadyExistsException("This employee already exists.");
						 throw ex;
			 }
			
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter Student name   : ");
			String sname = scan2.next();
			
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter Student DOB : ");
			String sdob = scan3.next();
			
			Scanner scan4 = new Scanner(System.in);
			System.out.println("Enter marks in Physics   : ");
			int sp = scan4.nextInt();
			
			Scanner scan5 = new Scanner(System.in);
			System.out.println("Enter marks in Chemistry : ");
			int sc = scan5.nextInt();
			
			Scanner scan6 = new Scanner(System.in);
			System.out.println("Enter marks in Maths   : ");
			int sm = scan6.nextInt();
			
			Scanner scan7 = new Scanner(System.in);
			System.out.println("Enter total marks : ");
			int stotal = scan7.nextInt();
			
			Scanner scan8 = new Scanner(System.in);
			System.out.println("Enter the Grade : ");
			String sg = scan8.next();
			
			pst.setInt(1, rno);//fill up the question mark with its value
			pst.setString(2, sname);
			pst.setString(3, sdob);
			pst.setInt(4, sp);
			pst.setInt(5, sc);
			pst.setInt(6, sm);
			pst.setInt(7, stotal);
			pst.setNString(8, sg);
		
		 System.out.println("tRYING TO EXECUTE THE PREPARED STATEMENT..");
		 int rows = pst.executeUpdate();
		 
		 System.out.println("Prepred Statement executed, inserted the records :..."+rows);
		
		 pst.close();	conn.close();
 }
	catch (SQLException e) 
	{
		e.printStackTrace();		 
	}
}

private static ResultSet executeQuery(String string) {

	return null;
}

private static boolean next() {
	
	return false;
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

