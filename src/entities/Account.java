package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(Integer number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
		
	}
	
	public String toString() {
		return "Account " 
				+ number
				+ " holder: " 
				+ holder 
				+ ", balance: $ " 
				+ String.format("%.2f", balance);
	}
	
}
