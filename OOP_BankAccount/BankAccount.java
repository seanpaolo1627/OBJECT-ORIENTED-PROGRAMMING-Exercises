package OOP_BankAccount;

public abstract class BankAccount {

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    final int accountNumber;
    double currentBalance = 0.0;

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
}
