package savingsAccount;

public class savingsAccount {
public double balance;
public String name;
public double interestRate = 0.01;

public void deposit (double sum){
	balance += sum;
}
public void withdraw (double sum){
	if (sum < 0 || sum > balance){
	System.out.println("Error");
	return;
	}
	balance -= sum;
	System.out.println("Successful withdraw of " + sum + ", new balance is " + balance);		
}
}
