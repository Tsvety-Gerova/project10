package prj14zad1;

import java.util.Date;

public class Account {

	private int id = 0;
	public double balance = 0;
	private static  double yearInterestRate = 4.5; // godishna lihva
	Date dateCreated = new Date();
	
	Account() {
	}
	
	Account(int id, double balance) {
		this.setId(id);
		this.setBalance(balance);
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
		
	public static double getYearInterestRate() {
		return yearInterestRate;
	}

	public static void setYearInterestRate(double yrInterestRate) {
	    yearInterestRate = yrInterestRate;
	    
	}
		
	public Date getDateCreated() {
			return dateCreated;
		}
	
	
	public static double getMonthlyInterestRate(double yearInterestRate) {
		 return yearInterestRate/12;
	}
	
	public double getMonthlyInterest(double monthlyInterestRate) {
		return balance*monthlyInterestRate;
	}
	
	public void withdraw(double draw) {
		balance -= draw;
	}
	
	public void deposit (double sum) {
		balance += sum;
	}

	
	
	
	
	
	
	
}
