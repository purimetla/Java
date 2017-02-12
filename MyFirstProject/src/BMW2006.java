
public class BMW2006 extends BMW2002 {

	public BMW2006(int numberOfDoors, int numberOfGears,
			int numberOfFuelInjectors, String engineType) {
		super(numberOfDoors, numberOfGears, numberOfFuelInjectors, engineType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String attachGPS() {
		// TODO Auto-generated method stub
		return "BMW 2006 is installed with GPS";
	}
	
	@Override
	public void setYear(int year) {
		// TODO Auto-generated method stub
		this.year = year;
	}
	
	public String appendRareViewCamera(){
		return "BMW " + year + " does not rare view Camera Functionality";
	}
	
	
	

}
