
public class MercedezBenz2011 extends MercedesBenz2002 {

	public MercedezBenz2011(int numberOfDoors, int numberOfGears,
			int numberOfFuelInjectors, String engineType) {
		super(numberOfDoors, numberOfGears, numberOfFuelInjectors, engineType);
		// TODO Auto-generated constructor stub
	}

	public String attachGPS(){
		return "MercedezBenz2011 comes with GPS";
	};
	
	public String appendRareViewCamera(){
		return "MercedezBenz2011 comes with rare view camera";
	};
	
	public String fourWheelDrive(){
		return "MercedezBenz2011 comes with four wheel drive";
	};

}
