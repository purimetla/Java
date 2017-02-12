
public class BMW2010 extends BMW2006 {

	public BMW2010(int numberOfDoors, int numberOfGears,
			int numberOfFuelInjectors, String engineType) {
		super(numberOfDoors, numberOfGears, numberOfFuelInjectors, engineType);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setYear(int year) {
		// TODO Auto-generated method stub
		this.year = year;
	}	

	@Override
	public String appendRareViewCamera() {
		// TODO Auto-generated method stub
		return "BMW " + year + " has rare view camera";
	}

	
	
}
