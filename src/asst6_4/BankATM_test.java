package asst6_4;

import java.util.*;   //importing all classes from java's util library..
public class BankATM_test {

		private static Scanner sc1;

		public static void main(String[] args) throws BankATMException      
		{		
			
			System.out.println("******* Entering ATM details *********");
			System.out.println("Please Enter ATM Id, Bank Name, Location, Balance: ");
			
			// Asking values of ATM details from the user.
	        // For taking input from the user, we have to make the object of Scanner class.
	      	
			Scanner sc=new Scanner(System.in);   
			
			BankATM atmDemo = new BankATM( sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
			
			//Created the BankATM class object and passed the parameters in the constructor which are input by user.
						{
				System.out.println("\n******* Depositing Amount *********");
				System.out.println("Please enter how much you want to Deposit: ");
				sc1 = new Scanner(System.in);
			atmDemo.deposit(sc1.nextInt());       //Depositing the amount in the ATM.
			}
			try        //try block.
			{
				System.out.println("\n******* WithDrawing Amount *********");
				System.out.println("How much amount you want to withdraw: ");
				sc1 = new Scanner(System.in);
				atmDemo.withdraw(sc1.nextInt());      //Withdraw the amount from the ATM.
			}
			catch(BankATMException e)       //catch block.
			{
				System.out.println(e);      //Printing the Exception.
			}
			
			atmDemo.displayATMDetails();        //Displaying the ATM details.
					
			try        //try block.
			{
			    atmDemo.withdraw(100);      //Withdraw the amount from the ATM.
			}
				catch(BankATMException e)       //catch block.
			{
				System.out.println(e);      //Printing the Exception.
			}
			
				sc.close();      //Closing the Scanner class object.
		}     //End of main function.

	}     //End of class.