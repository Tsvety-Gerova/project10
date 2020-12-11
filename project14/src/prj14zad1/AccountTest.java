package prj14zad1;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account account = new Account(1222,20000);
		
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("The balance is " + account.getBalance());
		System.out.println("The monthly interest rate is " + account.getMonthlyInterestRate(4.5));
	    System.out.println("The date is " + account.dateCreated);
	
	}

}
