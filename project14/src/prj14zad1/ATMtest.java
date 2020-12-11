package prj14zad1;

import java.util.Scanner;

public class ATMtest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		Account u1 = new Account();
//		Account u2 = new Account();
//		Account u3 = new Account();
//		Account u4 = new Account();
//		Account u5 = new Account();
//		Account u6 = new Account();
//		Account u7 = new Account();
//		Account u8 = new Account();
//		Account u9 = new Account();
//		Account u10 = new Account();
		
		Account[] users; // = {u1, u2, u3, u4, u5, u6, u7, u8, u9, u10}; 
		users = new Account[10];
		
		for (int i = 0; i < 10; i ++) {
			users[i].balance = 100;
		}
		for (int i = 1; i > 0; i ++) {

			System.out.println("Enter an id:");
			int enteredId = sc.nextInt();			
			
			if (enteredId < 0 || enteredId > 9) {
				System.out.println("Invalid input. Try again");
			
			} else if (enteredId >= 0 && enteredId <= 9) {
				i = enteredId;
				System.out.println("Main menu:\n 1: check balance\n 2: withdraw\n 3: deposit\n 4: exit\n Enter a choice:");
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("The balance is " + users[i].balance);
				
				}else if(choice == 2) {
					System.out.println("Enter an amount to withdraw:");
					double sumW = sc.nextDouble();
					users[i].withdraw(sumW);
					System.out.println("The new balance is " + users[i].balance);
					
				}else if(choice == 3) {
						double sumD = sc.nextDouble();
						users[i].deposit(sumD);
						System.out.println("The new balance is " + users[i].balance);
					}else if (choice == 4) {
						System.out.println("Have a nice day!");
					}
			
		}
		}		
	}

}
