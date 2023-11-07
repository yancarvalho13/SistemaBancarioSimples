package entities;

public class Bank {

	private int number;
	private String holder;
	private double balance;
	
	
	
	public Bank(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}



	public Bank(int number, String holder, double initDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initDeposit);
		
	}



	public String getHolder() {
		return holder;
	}



	public void setHolder(String holder) {
		this.holder = holder;
	}



	public int getNumber() {
		return number;
	}



	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance +=amount;
	}

	public void withdraw(double amount) {
		balance -=amount+5;
	}
	
	public String toString(){
		return "Account "
				+number
				+", Holder: "
				+holder
				+", Balance: $ "
				+String.format("%.2f", balance);
	}
	}

