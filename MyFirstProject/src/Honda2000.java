
public class Honda2000 implements Car{
	
	public int numberOfDoors = 4;
	public int numberOfGears = 5;
	public int numberOfFuelInjectors = 4;
	public String engineType = "V4";
	
	
	

	public Honda2000(int numberOfDoors, int numberOfGears,int numberOfFuelInjectors, String engineType) {
		super();
		this.numberOfDoors = numberOfDoors;
		this.numberOfGears = numberOfGears;
		this.numberOfFuelInjectors = numberOfFuelInjectors;
		this.engineType = engineType;
	}

	@Override
	public String assembleTyres() {
		// TODO Auto-generated method stub
		return "Honda is assembled with " + numberOfTyres  + " tyres";
	}

	@Override
	public String assembleEngine() {
		// TODO Auto-generated method stub
		return "Honda is assembled with engine " + engineType;
	}

	@Override
	public String assembleChasis() {
		// TODO Auto-generated method stub
		return "Honda is assembled with Chasis";
	}

	@Override
	public String assembleTransmission() {
		// TODO Auto-generated method stub
		return "Honda is assembled with " + numberOfGears + "gears";
	}

	@Override
	public String assembleFuelInjectors() {
		// TODO Auto-generated method stub
		return "Honda is assembled with " + numberOfFuelInjectors  + " Fuel Injectors";
	}

	@Override
	public String assembleSeats() {
		// TODO Auto-generated method stub
		return "Honda is assembled with seats";
	}

	@Override
	public String assembleDoors() {
		// TODO Auto-generated method stub
		return "Honda is assembled with " + numberOfDoors  + " doors";
	}
	
	

}
