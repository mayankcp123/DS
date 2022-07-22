
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricParameters myCkt= new ElectricParameters();
		myCkt.Resistance();
		myCkt.PotentialDiffrence(5.5f);
		double Currentout=myCkt.Current(45, 5.5f);
		System.out.println("Current "+Currentout );
		double Powerout= myCkt.Power();
		System.out.println("Power "+Powerout );
	}
	
}

class ElectricParameters 
{
	//1
	void Resistance()
	{
		System.out.println("Resistance value is 45 Ohm");
		System.out.println("------------------");
	}
	//2
	void PotentialDiffrence(float V) 
	{
		System.out.println("Potential diffrence across the resistance.");
		System.out.println(" V= " +V);
		System.out.println("------------------");
	}
	//3
	double Current (int R, float V) {
		System.out.println("Calculating the value of current.");
		System.out.println("R=" +R);
		System.out.println("V=" +V);
		System.out.println("------------------");
		return V/R ;
	}
	//4
	double Power() {
		System.out.println("Power delivered.");
		System.out.println("Calculating the Power by battery.");
		System.out.println("------------------");
		return 5.5*0.122 ;
	}

}
