// Project:		Class and Inheritance
// Name:		Brad D. Messner
// Version:		1.0
// Date:		Sep 2, 2020
// Desc: 		This is just an example of a basic class with inheritance
 
import java.util.Scanner;

public class BankAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare our Variables
		Scanner keyboard = new Scanner (System.in);
		double deposit = 0;
		double withdrawal = 0;
		
		// Create a Checking account of BankAccount
		BankAccount checking = new BankAccount();
		checking.name = "Brad's Primary Checking";
		checking.accountNumber = 85914;
		checking.type = 'C';
		
		// Create a Savings account
		BankAccountSavings savings = new BankAccountSavings();
		savings.type = 'S';

		// Lets set the initial balance
		// checking.balance = 200.00;
		// I CANNOT do this because balance is PRIVATE
		checking.addDeposit(200.00);
		System.out.println("Your starting balance is: $" + checking.getBalance());
		
		// Make deposit
		System.out.print("How much would you like to deposit? ");
		deposit = keyboard.nextDouble();
		checking.addDeposit(deposit);
		
		// Make withdrawal
		System.out.print("How much would you like to withdrawal? ");
		withdrawal = keyboard.nextDouble();
		checking.subtractWithdrawal(withdrawal);
		
		// Transfer funds from Checking to Savings
		checking.subtractWithdrawal(50.00);
		savings.addDeposit(50.00);
		
		// Calculate interest
		savings.addDeposit(savings.calcInterest(savings.getBalance()));
		
		
		// Check Balance
		System.out.println("Your final checking balance is: $" + checking.getBalance());
		System.out.println("Your final savings balance is: $" + savings.getBalance());

		// Close the keyboard
		keyboard.close();
		
	}

}
