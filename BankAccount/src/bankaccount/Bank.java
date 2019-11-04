package bankaccount;
import java.util.Scanner;

public class Bank {
	private String name;
	private long balance;

	Scanner save=new Scanner(System.in);
	
	//method to open account
	void openAccount()
	{ 
		System.out.println("Enter Name: ");
		name=save.nextLine();
		System.out.println("Enter Balance: ");
		 balance=save.nextLong();
	}

	//method to display account details
	void showAccount()
	{ 
		System.out.println("Owner Name:"+name+"\n Bank Balance:"+balance);
	}

	//method to deposit money
	void deposit()
	{
		long amt;
		System.out.println("Enter Amount to Deposit : ");
		amt=save.nextLong();
		if(amt>0) {
		balance=balance+amt;
		System.out.println("Your new balance is"+ balance );
		}
		else if(amt==0) {
			System.out.println("Account cannot be empty.");
		}
		else {
			System.out.println("Less Balance. Transaction Failed.");
		}
		
	}

	//method to withdraw money
	void withdrawal()
	{
		long amt;
		System.out.println("Enter Amount to withdraw: ");
		amt=save.nextLong();
		if(balance>amt)
		{ 
			balance=balance-amt;
			System.out.println("Your new balance is "+ balance);
			
		}
		else if(balance==amt) {
			System.out.println("You cannot withdraw all money.");
			System.out.println("Account cannot be empty.");
			
		}
		else
		{
			System.out.println("Less Balance. Transaction Failed.");
			System.out.println("Your Current balance is "+ balance);
		}
	}

	//method to search an account number
	boolean search(String NAME)
	{ 
		if(name.equals(NAME))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
}