package curs11Homework;

public class Account {
	
	private int accountNumber = 123456789;
	public double balance = 150;
	public String accountOwner;
	

	
	public void withdraw(int amount) throws InsufficientFundsException {
		
		if(amount < balance) {
			throw new InsufficientFundsException(amount + "The amount you entered is greater than the available balance :" +balance);
			
		} else {
		
		balance = balance - amount;
	}
}
}
