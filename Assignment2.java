
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car();
		c1.carData("Ford",10000,7780);
		c1.changeInProduction(100);
		c2.carData("Ferrari",2000,1800);
		c2.changeInProduction(50);	
		c1.changeInSales(300);	
		c2.changeInProduction(-280);	
	}

}
class Car
{
	
	String carName;
	int production;
	int sales;

	void carData(String x, int y, int z)
	{
		carName=x;
		production =y;
		sales =z;
	}
	int changeInProduction(int w) {
		
		int numberOfNewCar=production+w;
		return numberOfNewCar;
	}
	int changeInSales(int a) {
		
		int Sales=sales+a;
		return Sales;
	}
	
}
