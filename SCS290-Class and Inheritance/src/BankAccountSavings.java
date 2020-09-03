// Class Name:	BankAccountSavings
// Purpose:		Create and store bank account info


public class BankAccountSavings extends BankAccount{

	// Declare variables
	public double interestRate;
	
	// Constructor
	public BankAccountSavings()
	{
		// Set the interest rate
		interestRate = .02;
	}
	
	// Calc interest
	public double calcInterest(double balance)
	{
		double interestAmount;
		interestAmount = balance * interestRate;
			
		// balance = balance * (1+interestRate);		// multiply times 1.02
		return interestAmount;
	}
	
	
}
