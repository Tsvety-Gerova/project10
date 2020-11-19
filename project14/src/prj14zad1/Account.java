package prj14zad1;

import java.util.Date;

public class Account {

	private int id = 0;
	private static double balance = 0;
	private double yearInterestRate = 0; // godishna lihva
	Date dateCreated = new Date();
	
	Account() {
	}
	
	Account(int id, double balance) {
		this.balance = balance;
		
	}
	
	public void setId(int id) {
	this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setYearInterestRate(double yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
	}
	public double getYearIneterstRate() {
		return yearInterestRate;
	}
	
	
	public double getMonthlyInterestRate(double yearInterestRate) {
		 double monthlyInterestRate = yearInterestRate/12;
		 return monthlyInterestRate;
	}
	
	public double getMonthlyInterest(double monthlyInterestRate) {
		return balance*monthlyInterestRate;
	}
	
	public static double withdraw(double sum) {
		balance = balance - sum;
		return balance;
	}
	
	public double deposit (double sum) {
		balance = balance + sum;
		return balance;
	}
	
	
	
	
	
	
}
