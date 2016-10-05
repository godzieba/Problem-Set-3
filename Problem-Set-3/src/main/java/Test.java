

public class Test {

	public static void main(String[] args) {
		
		int ID = 1122;
		double balance = 20000;
		double annualInterestRate = 4.5;
		
		Account account = new Account(ID, balance);
		account.setAnnualInterestRate(annualInterestRate);
		
		try {
			account.Withdraw(2500);
			System.out.println("Withdrawn $2500.");
		} catch (InsufficientFundsException e) {
			System.out.println("Insufficient funds available in account. $" + e.getAmount() + " needed to complete witdrawl.");;
		}
		
		account.Deposit(3000);
		System.out.println("Deposited $3000");
		
		System.out.println("Balance = $" + account.getBalance());
		System.out.println("Annual Interest Rate = " + account.getAnnualInterestRate() + "%");
		System.out.println("Date Created = " + account.getDateCreated());
		
		
		System.out.println("\n");
		
		
		ID = 1342;
		balance = 31000;
		annualInterestRate = 3.5;
		
		Account account2 = new Account(ID, balance);
		account2.setAnnualInterestRate(annualInterestRate);
		
		try {
			account2.Withdraw(40000);
			System.out.println("Withdrawn $40000.");
		} catch (InsufficientFundsException e) {
			System.out.println("Insufficient funds available in account. $" + e.getAmount() + " needed to complete witdrawl.");;
		}
		
		account2.Deposit(1400);
		System.out.println("Deposited $1400");
		
		System.out.println("Balance = $" + account2.getBalance());
		System.out.println("Annual Interest Rate = " + account2.getAnnualInterestRate() + "%");
		System.out.println("Date Created = " + account2.getDateCreated());


	}
	
}
