package business;

public class SavingsAccount extends Account {
	private double monthlyIntRate;
	private double monthlyIntPayment;
	
	
	public SavingsAccount(double balance, double monthlyIntRate) {
		super(balance);
		this.monthlyIntRate = monthlyIntRate;
	}
	
	//monthly interest payment calculated by a method 
	//that applies the payment to the account balance
	public void applyMonthlyPayment () {
		monthlyIntPayment = balance * monthlyIntRate;
		balance += monthlyIntPayment;
	}
	
	public double getMonthlyIntPayment() {
		return monthlyIntPayment;
	}
}
