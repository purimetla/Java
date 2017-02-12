//Examples of inheritance
//Sub class or child class or a derived class
public class JuniorSavingsAccount extends SavingsAccount{
	
	String parentOrGuardianName;
	
	//parameterized constructor
	public JuniorSavingsAccount(int accountNo, float balance, int pincode,String parentOrGuardianName) {
		super(accountNo, balance, pincode);
		this.parentOrGuardianName = parentOrGuardianName;
	}

}
