import java.lang.Math;

public class SavingsAccount extends BankAccount{
	private static double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber = super.getAccountNumber().concat("-" + Integer.toString(savingsNumber));
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber++;
		this.accountNumber = super.getAccountNumber().concat("-" + Integer.toString(savingsNumber));
	}
	
	public void postInterest() {
		setBalance(getBalance() * (1 + (rate/12.0)));
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	
	
	
	
}
