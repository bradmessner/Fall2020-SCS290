// Class Name:	BankAccount
// Purpose:		Create and store bank account info


public class BankAccount {

	// Declare variables
	public String name;
	private double balance;
	public char type;
	public int accountNumber;
	
	// Build Constructor  (Note: Constructor name is the same as Class Name)
	// Constructor is ENTIRELY optional - you do NOT need constructor
	public BankAccount()
	{
		// Set the initial balance of account
		balance = 0;
	}
	
	// Deposit funds
	public void addDeposit(double dep) 
	{
		balance = balance + dep;
	}
	
	// Withdrawal funds
	public void subtractWithdrawal(double wit) 
	{
		if (balance < wit)
		{
			System.out.println("You do not have enough funds to withdrawal that amount.");
		}
		else
		{
			balance = balance - wit;
		}
	}
	
	// Check balance
	public double getBalance()
	{
		return balance;
	}
	
	
}
