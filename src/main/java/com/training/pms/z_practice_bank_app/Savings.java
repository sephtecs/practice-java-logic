package com.training.pms.z_practice_bank_app;

public class Savings extends Account{
	private static String accountType = "Savings";
	
	Savings(double initialDeposit){
		super();
		this.setBalance(initialDeposit);
		this.checkInterest(0);
//		if(initialDeposit > 10000) {
//			this.setInterest(5);
//		} else {
//			this.setInterest(2);
//		}
	}
	
	@Override
	public String toString() {
		return "Account Type: " + accountType + " Account \n" + 
				"Account Number: " + this.getAccountNumber() + "\n" +
				"Balance: " + this.getBalance() + "\n" +
				"Interest Rate: " + this.getInterest() + "%\n";
				
	}
}
