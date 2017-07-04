package asst6_4;

public class BankATM        //Class declaration containing bank ATM details. 
{
	int atmId;         //int variable to store the atm ID.
	String bankName;     //String variable to store the name of bank.
	String location;      //String to store location where bank is situated.    
	double balance;       //double variable to store the value of available balance.
	
	public BankATM(int atmId, String bankName, String location, double balance)     //constructor.
	{
		//Initializing class variables by parameters.
		this.atmId = atmId;     
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	
	public void withdraw(double amt)  throws BankATMException       //Withdraw function to withdraw the amount.
	{
		if(balance < 10000.0 || balance < amt)       //Checking weather the withdrawl can be possible or not according to given condition.
		{
			throw new BankATMException();        //Throwing Exception if withdrawl is not possible.
		}
		else
		{
			balance = balance - amt;          //if withdrawl can be possible then reducing the balance.
			System.out.println("You have withdrawn "+amt+" Rs. and your available balance is "+balance+" Rs.");     //Printing the statement.
		}
	}
	
	public void deposit(double amt)     //Depositing the amount. No need to throw exception because deposit is always possible.
	{
		balance = balance + amt;       //Increasing the value of balance.
		System.out.println("You have depositted "+amt+" Rs. and available balance is "+balance+" Rs.");     //Printing the statement.
	}
	public void displayATMDetails() throws BankATMException           //Function will display the details of ATM.
	{
         //Displaying the details of ATM.
		System.out.println("\n*******Displaying the User's ATM details*********");
		System.out.println("User ATM Id is: "+atmId);
		System.out.println("User Bank Name is: "+bankName);
		System.out.println("Location of ATM is: "+location);
		System.out.println("Available balance is: "+balance);
	}
	
}   //End of class.