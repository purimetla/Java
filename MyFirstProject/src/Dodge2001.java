
public class Dodge2001 implements Car{
	
	public int numberOfDoors = 4;
	public int numberOfGears = 6;
	public int numberOfFuelInjectors = 4;
	public String engineType = "V4";


	public Dodge2001(int numberOfDoors, int numberOfGears,int numberOfFuelInjectors, String engineType) {
		super();
		this.numberOfDoors = numberOfDoors;
		this.numberOfGears = numberOfGears;
		this.numberOfFuelInjectors = numberOfFuelInjectors;
		this.engineType = engineType;
	}

	@Override
	public String assembleTyres() {
		// TODO Auto-generated method stub
		return "Dodge is assembled with " + numberOfTyres  + " tyres";
	}

	@Override
	public String assembleEngine() {
		// TODO Auto-generated method stub
		return "Dodge1 is assembled with engine " + engineType;
	}

	@Override
	public String assembleChasis() {
		// TODO Auto-generated method stub
		return "Dodge is assembled with Chasis";
	}

	@Override
	public String assembleTransmission() {
		// TODO Auto-generated method stub
		return "Dodge is assembled with " + numberOfGears + "gears";
	}

	@Override
	public String assembleFuelInjectors() {
		// TODO Auto-generated method stub
		return "Dodge is assembled with " + numberOfFuelInjectors  + " Fuel Injectors";
	}

	@Override
	public String assembleSeats() {
		// TODO Auto-generated method stub
		return "Dodge is assembled with seats";
	}

	@Override
	public String assembleDoors() {
		// TODO Auto-generated method stub
		return "Dodge is assembled with " + numberOfDoors  + " doors";
	}
	
	

}

