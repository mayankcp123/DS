import java.time.LocalDate;

public class InheritanceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AadharCard aadharCard1 = new AadharCard();
		AadharCard aadharCard2 = new AadharCard();
		AadharCard aadharCard3 = new AadharCard();
		
		PANcard pan1= new PANcard();
		PANcard pan2= new PANcard();
		PANcard pan3= new PANcard();
		
		pan1.setPANcard("ABC12345","Income Tax Department","Vicky Kaushal","Random Kaushal",LocalDate.of(2002, 12, 25) );
		pan2.setPANcard("WTD13651","Income Tax Department","Salman Khan","Salim Khan",LocalDate.of(2003, 11, 20) );
	//	pan3.setPANcard("WFZ12679","Income Tax Department","Katrina Kaif","Dont know kaif",LocalDate.of(2004, 10, 21) );
		
		
		aadharCard1.setAdhaarCard("1234 1234 1234", "Vicky Kaushal","Govt Of India", "Mumbai", LocalDate.of(2002, 12, 25), "8876345678");
		aadharCard2.setAdhaarCard("5234 6234 9234", "Salman Khan","Govt Of India", "Pune", LocalDate.of(2003, 11, 20), "7776342618");
	//	aadharCard3.setAdhaarCard("6234 7234 3254", "Katrina Kaif","Govt Of India", "Nasik", LocalDate.of(2004, 10, 21), "66876345178");
		
		Person thePersonObj = new Person('F',"Vicky", 25, aadharCard1,pan1);
//		System.out.println("the person : "+thePersonObj);

		thePersonObj.printPerson();
		System.out.println("-----------");
		
		
		Student theStudentObj = new Student('M', "Sallu", 24, aadharCard2, pan2, "Bits Pilani", "MBA", 'A');
		
		theStudentObj.printStudent();
//		System.out.println("the student "+theStudentObj);
		
		System.out.println("-----------");
		
		Employee empObj = new Employee('F', "Kat", 22, aadharCard3,pan3, "IIT", "Mtech", 'A', "Google", "Analyst", 25000);
		empObj.printEmployee();
		
		//		System.out.println("emp obj "+empObj);
	}

}

class AadharCard
{
	String aadharNumber;
	String nameOnAdhaar;
	String issuedBy;
	String address;
	LocalDate birthdate;
	String phoneNumber;
	
	public void setAdhaarCard(String aadharNumber, String name, String issuedBy, String address, LocalDate birthdate, String phoneNumber) {
		
		this.aadharNumber = aadharNumber;
		this.nameOnAdhaar = name;
		this.issuedBy = issuedBy;
		this.address = address;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
	}
	
	void printAdhaarCard() 
	{
		System.out.println("Aadhar Card : "+aadharNumber);
		System.out.println("Aadhar Name : "+nameOnAdhaar);
		System.out.println("Issued By   : "+issuedBy);
		System.out.println("Address     : "+address);
		System.out.println("Birthdate   : "+birthdate);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("-------");
	}
}
class PANcard
{
	String PANnumber;
	String issuedBy;
	String name;
	String fatherName;
	LocalDate dOB;
	public void setPANcard(String PANnumber, String issuedBy, String name, String fatherName, LocalDate dOB)
		{
			this.PANnumber = PANnumber;
			this.issuedBy = issuedBy;
			this.name = name;
			this.fatherName = fatherName;
			this.dOB = dOB;
		}
	void printPANcard() 
	{
		System.out.println("PAN Card     : "+PANnumber);
		System.out.println("Name         : "+name);
		System.out.println("Father's Name: "+fatherName);
		System.out.println("Issued By    : "+issuedBy);
		System.out.println("Birthdate    : "+dOB);
		System.out.println("-------------------");
	}
	
}

class Person
{
	char gender; //hasA 1
	String name; //hasA 2
	int age;     //hasA 3
	AadharCard aadharCard; //hasA 4 ( 5 )
	PANcard pan;
   //PanCard
//VotingCard
	//DL
	
	public Person(char gender, String name, int age) 
	{
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public Person(char gender, String name, int age, AadharCard aadharCard, PANcard pan) 
	{
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.aadharCard = aadharCard;
		this.pan = pan;
	}

	void printPerson() 
	{
		System.out.println("GENDER : "+gender);
		System.out.println("AGE    : "+age);
		System.out.println("NAME   : "+name);
		System.out.println("-----Aadhaar Card Info------");
		if(aadharCard!=null) 
		{
			aadharCard.printAdhaarCard();
		}
		else 
		{
			System.out.println("No Aadhar Card Info");
		}
		System.out.println("-----PAN Card Info------");
		if(pan!=null) {
			pan.printPANcard();
		}
		else 
		{
			System.out.println("No PAN Card Info found.");
		}
	}
}

class Student extends Person //isA
{
//	3 fields from the Person  + 
	String college; //hasA
	String qualification; //hasA
	char grade; //hasA
	
	public Student(char gender, String name, int age, String college, String qualification, char grade) {
		super(gender, name, age);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}

	public Student(char gender, String name, int age, AadharCard aadharCard, PANcard PANcard, String college,
			String qualification, char grade) {
		super(gender, name, age, aadharCard, PANcard);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}
	
	void printStudent() {
		super.printPerson();
		System.out.println("COLLEGE: "+college);
		System.out.println("QUAL   : "+qualification);
		System.out.println("GRADE  : "+grade);

	}

}

class Employee extends Student //isA
{
	String company; //hasA
	String job; //hasA
	double salary; //hasA
	
	public Employee(char gender, String name, int age, String college, String qualification, char grade, String company,
			String job, double salary) {
		super(gender, name, age, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}
	
	public Employee(char gender, String name, int age, AadharCard aadharCard, PANcard PANcard, String college,
			String qualification, char grade, String company, String job, double salary) 
	{
		super(gender, name, age, aadharCard, PANcard, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}
	void printEmployee() {
		super.printStudent();
		System.out.println("COMPANY: "+company);
		System.out.println("JOB    : "+job);
		System.out.println("SALARY : "+salary);
	}

	/*@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + ", company=" + company + ", job=" + job + ", salary="
				+ salary + "]";
	}*/
}
	


/*
 * 
 * 		super()
 * 
 * 
 * 		super.
 * 
 * 
 */
