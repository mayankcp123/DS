
public class isAhasAproducesA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceOfOperation place=new PlaceOfOperation("far",10);
		Power p = new Power(5, "10 cr","200 acre",10);
		TempBusiness tb = new TempBusiness("Casino", "Bar, Club, Charity");
		MoneyLaundering ml= new MoneyLaundering("Illegal","Large",10000000,place,"Pablo Escobar",1000000000);
		Business business= new Business("Illegal","large",10000000);
		Profit profit= ml.wash(p, tb);
		business.printBusiness();
		profit.printProfit();
	}

}
class Business{
	String businessEntity,size;
	int capital;
	public Business(String businessEntity, String size, int capital) {
		super();
		this.businessEntity = businessEntity;
		this.size = size;
		this.capital = capital;
	}
	void printBusiness() {
		System.out.println("----BusinessInfo-----");
		System.out.println("Business Name : "+businessEntity);
		System.out.println("Size of the business : "+size);
		System.out.println("Capital invested in the business : "+capital);
	}
	
}
class MoneyLaundering extends Business //isA
{
	PlaceOfOperation place;
	String clientName;
	int amountToLaunder;
	
	public MoneyLaundering(String businessEntity, String size, int capital, PlaceOfOperation place, String clientName,
			int amountToLaunder) {
		super(businessEntity, size, capital);
		this.place = place;
		this.clientName = clientName;
		this.amountToLaunder = amountToLaunder;
	}
	Profit wash(Power p, TempBusiness tb)
	{
		System.out.println(businessEntity+"is good for making money and it takes"+capital+" minimum as capital.");
		System.out.println("About"+amountToLaunder+"is laundered.");
		System.out.println(" the "+tb.majorBusinessforLaundering+" is the major laundering temp business.");
		
	Profit profit = new Profit(10000000, 3);
	return profit;
	}
}
class PlaceOfOperation{
	String distanceOfLocation;
	int numberOfGuardingPeople;
	public PlaceOfOperation(String distanceOfLocation, int numberOfGuardingPeople) {
		super();
		this.distanceOfLocation = distanceOfLocation;
		this.numberOfGuardingPeople = numberOfGuardingPeople;
	}
	
	
}
class Power{
	int numberOfBouncers;
	String capital, landArea;
	int leastNumberofPeopleInNetwork;
	public Power(int numberOfBouncers, String capital, String landArea, int leastNumberofPeopleInNetwork) {
		super();
		this.numberOfBouncers = numberOfBouncers;
		this.capital = capital;
		this.landArea = landArea;
		this.leastNumberofPeopleInNetwork = leastNumberofPeopleInNetwork;
	}
	
	
}
class TempBusiness{
	String majorBusinessforLaundering,otherBusinesses;

	public TempBusiness(String majorBusinessforLaundering, String otherBusinesses) {
		super();
		this.majorBusinessforLaundering = majorBusinessforLaundering;
		this.otherBusinesses = otherBusinesses;
	}
	
	
}
class Profit{
	int amountPerMonth;
	int newBusinessPerYear;
	public Profit(int amountPerMonth, int newBusinessPerYear) {
		super();
		this.amountPerMonth = amountPerMonth;
		this.newBusinessPerYear = newBusinessPerYear;
	}
	void printProfit() {
		System.out.println("Money Profit   : "+amountPerMonth);
		System.out.println("Business Profit: "+newBusinessPerYear);
	}
	
}