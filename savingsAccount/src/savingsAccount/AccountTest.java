package savingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		savingsAccount  tsvetySave = new savingsAccount();
		tsvetySave.name = "Tsvety";
		tsvetySave.balance = 1000;
		
		tsvetySave.deposit(50.98);
		tsvetySave.withdraw(300);
	}

}
