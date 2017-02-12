
public class BMW2002 extends BMW2000{

	public BMW2002(int numberOfDoors, int numberOfGears,
			int numberOfFuelInjectors, String engineType) {
		super(numberOfDoors, numberOfGears, numberOfFuelInjectors, engineType);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void setYear(int year) {
		// TODO Auto-generated method stub
		this.year = year;
	}



	public String attachGPS(){
		return "BMW " + year + " does not have GPS";
		
	}
	

}
