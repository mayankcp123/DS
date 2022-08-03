public class NestedClassTest1
{
public static void main(String[] args) {
		Bike B = new Bike("Ducati", "Sports");
		
		Bike.Engine bikeEngine = new Bike.Engine();
		
		bikeEngine.setEngineType("IC");
		bikeEngine.setEnginePower("350cc");
		bikeEngine.setEngineWt("Heavy");
		
		B.runBike();
		System.out.println(bikeEngine);

	}

}


class Bike
{
	 String bikeName;
    String bikeType;
   
    public Bike(String name, String type) {
        this.bikeName = name;
        this.bikeType = type;
    }

    
    private String getBikeName() {
        return this.bikeName;
    }
    
    void runBike()
	{
	
			System.out.println("Yon can ride the bike");

	}


    public static class Engine {
        String enginePower;
        String engineType;
        String engineWt;
        
       /* public Engine(String engineType, String enginePower, String engineWt) {
			super();
			this.engineType = engineType;
			this.enginePower = enginePower;
			this.engineWt = engineWt;
        }*/
        public String getEngineType() {
			return engineType;
		}
		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
		public String getEnginePower() {
			return enginePower;
		}
		public void setEnginePower(String enginePower) {
			this.enginePower = enginePower;
		}
		public String getEngineWt() {
			return engineWt;
		}
		public void setEngineWt(String engineWt) {
			this.engineWt = engineWt;
		}
		@Override
		public String toString() {
			return "Engine [engineType=" + engineType + ", enginePower=" + enginePower + ", engineWt="
					+ engineWt +  "]";
    }
}
}
