package cl.ccs.patterns.creational.builder;

public class BankAccount {

	public static class Builder {
		

        private long accountNumber; //This is important, so we'll pass it to the constructor.
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;
        
        public Builder(long accountNumber) {
        	this.accountNumber = accountNumber;
        }
        
        
		
	}
	
	
}
