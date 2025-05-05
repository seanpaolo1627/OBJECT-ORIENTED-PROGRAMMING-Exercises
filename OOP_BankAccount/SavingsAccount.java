package OOP_BankAccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber) {
        super(accountNumber);
        
    }
    
    public void deposit(double amount){
        System.out.println("Savings Account " + accountNumber + " Current balance: " + currentBalance);
        currentBalance += amount;
        System.out.println("Deposited " + amount);
    }
    
    public void withdraw(double amount) { 
        System.out.println("Savings Account " + accountNumber + " Current balance: " + currentBalance);
    	if (amount <= currentBalance) {
	        currentBalance -= amount;
	        System.out.println("Withdrawed " + amount);
	    } 
    	else {
	        System.out.println("Insufficient funds.");
	    }
        
    }
    
    public void displayInfo() {
    	System.out.println("Savings Account " + accountNumber + " Current balance: " + currentBalance);
    }
    
}
