import java.time.LocalDate;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 empObj1= new Employee1(101, "Ram", "Accountant", LocalDate.of(2022, 07, 25), 75000, 15);
		Employee1 empObj2= new Employee1(102, "Shyam", "Engineer", LocalDate.of(2022, 07, 18), 55000,10);
		System.out.println("employee obj1 "+empObj1); //tostring invoked
		System.out.println("employee obj2 "+empObj2); 
	}

}
class Employee1
{
	private int employeeNumber;
	private String employeeName;
	private String job;
	private LocalDate joiningDate;
	private double salary;
	private double comm;
	public Employee1(int employeeNumber, String employeeName, String job, LocalDate joiningDate, double salary,
			double comm) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.job = job;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.comm = comm;
	}
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", job=" + job
				+ ", joiningDate=" + joiningDate + ", salary=" + salary + ", comm=" + comm + "]";
	}
	
	
}
