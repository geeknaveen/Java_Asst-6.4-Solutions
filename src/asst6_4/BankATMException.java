package asst6_4;

public class BankATMException extends Exception      //Class declaration which is the child class of inbuilt class Exception.  
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString()         //function to return string of Exception.
	{
		return "\nGenerating BankATMException because either your balance is less than 10000 or withdrawl amount is greater than available balance ";
				//returning String denoting that the Exception is happened.
	}
	
}    