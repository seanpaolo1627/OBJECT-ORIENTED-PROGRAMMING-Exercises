package OOP_BankAccount;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);

		String accountNumber_savingsAccount = input.nextLine();
		String depositAmount_savingsAccount = input.nextLine();
		String withdrawAmount_savingsAccount = input.nextLine();
		
		String accountNumber_checkingAccount = input.nextLine();
		String depositAmount_checkingAccount = input.nextLine();
		String withdrawAmount_checkingAccount = input.nextLine();

		SavingsAccount savingsAccount = new SavingsAccount(Integer.parseInt(accountNumber_savingsAccount));
		savingsAccount.deposit(Double.valueOf(depositAmount_savingsAccount));
		savingsAccount.withdraw(Double.valueOf(withdrawAmount_savingsAccount));
		savingsAccount.displayInfo();
		
		CheckingAccount checkingAccount = new CheckingAccount(Integer.parseInt(accountNumber_checkingAccount));
		checkingAccount.deposit(Double.valueOf(depositAmount_checkingAccount));
		checkingAccount.withdraw(Double.valueOf(withdrawAmount_checkingAccount));
		checkingAccount.displayInfo();
		
		input.close();

	}

}
