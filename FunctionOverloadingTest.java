
public class FunctionOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Battery batObj1=new Battery();
		batObj1.status();
		batObj1.status(75);
		batObj1.status(74.5f, 100);
		batObj1.status(74, "Charging");
		batObj1.status(74.5f, "Charging");
		batObj1.status("Null",75);
		batObj1.status("full","charging stopped");
		
		
	}

}
class Battery{
	Battery(int i){
		System.out.println("This is status of Battery. "+i);
	}
	Battery(){
		System.out.println("This is status of Battery. ");
	}
	void status()
	{
		System.out.println("The battery status is ...");
	}
	void status(int percentage)
	{
		System.out.println("The battery status is ..."+percentage);
	}
	void status(int percentage, String state )
	{
		System.out.println("The battery status is ..."+percentage +" and "+state);
		
	}
	void status(float percentage, int full )
	{
		System.out.println("The battery status is ..."+percentage +" and "+full);
	}
	void status(String state, int percentage )
	{
		System.out.println("The battery status is ..."+state +" and "+percentage +" percent.");
		
	}
	void status(float percentage, String state )
	{
		System.out.println("The battery status is ..."+percentage +" and "+state);
		
	}
	void status(String finals, String state )
	{
		System.out.println("The battery status is ..."+state +" and "+finals);
	}
}