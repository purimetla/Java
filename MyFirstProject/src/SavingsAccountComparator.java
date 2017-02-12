import java.util.Comparator;


public class SavingsAccountComparator implements Comparator<SavingsAccount>{

	@Override
	public int compare(SavingsAccount account1, SavingsAccount account2){
		
		if(account1.getAccountNo() > account2.getAccountNo()){
			return 1;
		}else if(account1.getAccountNo() < account2.getAccountNo()){
			return -1;
		}
		return 0;
	}

	
	}


