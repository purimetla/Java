//Parent class or super class or Base class
public class SavingsAccount //implements Comparable<SavingsAccount> 
	{
	
	//fields or instance variables or non-static variables
	int accountNo;
	float balance;
	int pincode;
	
	//static float interestRate = 4.25f;
	
	final static float interestRate = 4.25f;
	
	//Constructor
						  //parameters declared in the constructor are temporary to hold values, these parameters are different  to variables defined in a class
	
	//when calling a constructor, java implicitly passes the reference of an object, in this case "this" keyword is the reference. This variable holds the reference of the object which has to be initialized by the constructor
	public SavingsAccount(int accountNo, float balance, int pincode) {
		//super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.pincode = pincode;
	}
	
	//DEFINING METHOD
	//method-signature withdraw(int)
	//the method below is called instance methods or non-static methods
	public void withdraw(int withdrawalAmount){
		
		//business logic
		//withdrawal from branch
		if(withdrawalAmount <= balance){
			balance = balance - withdrawalAmount;
		}
		else{
			System.err.println("Insufficient funds");
		}
		
	}
	
	//withdrawal from ATM
	//withdraw(int,int) is the method signature in this case
	
	//method overloading--defining more than one method in a class with the same name but with different method signature
	public void withdraw(int withdrawalAmount, int pincode){
		
		if(pincode == this.pincode){
			
			if(withdrawalAmount <= 30000){
				
				withdraw(withdrawalAmount);
				
			}else{
				System.err.println("Withdrawal limit exceeded");
			}
			
		}else{
			System.err.println("Invalid Pincode");
		}
		
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public static float getInterestrate() {
		return interestRate;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
//	@Override
//	public int compareTo(SavingsAccount account2){
//		if(this.accountNo > account2.accountNo){
//			return 1;
//		}else if(this.accountNo < account2.accountNo){
//			return -1;
//		}
//		return 0;
//	}


	
	
}

