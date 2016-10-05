import java.util.Date;

public class Account {
	
	private int ID = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int iD, double initialBalance) {
		this();
		this.ID = iD;
		this.balance = initialBalance;		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}
	
	public void Withdraw(double withdrawl) throws InsufficientFundsException {
		if (withdrawl <= balance) {
			balance -= withdrawl;
		}
		else {
			double difference = withdrawl - balance;
			throw new InsufficientFundsException(difference);
		}
	}
	
	public void Deposit(double deposit) {
		this.balance += deposit;
	}

}
