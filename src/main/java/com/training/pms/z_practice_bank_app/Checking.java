package com.training.pms.z_practice_bank_app;



public class Checking extends Account{
	private static String accountType = "Checking";
	
	Checking(double initialDeposit){
		super();
		this.setBalance(initialDeposit);
		this.checkInterest(0);
//		if(initialDeposit > 10000) {
//			this.setInterest(0.05);
//		} else {
//			this.setInterest(0.02);
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
