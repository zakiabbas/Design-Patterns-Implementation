package bankaccount;
import java.util.Scanner;
public class MainClass {
	public static int NoOfTransaction = 0;
	public static void main(String[] args) {
		
		Scanner save=new Scanner(System.in);
		
		//create initial accounts
		System.out.println("No. of Accounts to be Register: ");
		int n=save.nextInt();
		Bank  C[]=new Bank[n];
		for(int i=0;i<C.length;i++)
		{   
			C[i]=new Bank();
			C[i].openAccount();
		}
		
		//run loop until menu 5 is not pressed
		
		int ch;
		do
		{
			System.out.println("\n \nMain Menu\n1.No. Of Transaction\n2.Search By Account\n3.Deposit\n4.Withdrawal\n5.Exit");
			System.out.println("Choose Option:");
			ch=save.nextInt();
			switch(ch)
			{ 
				case 1:
					System.out.println(NoOfTransaction);
					break;

				case 2:
					System.out.println("Enter Owner Name: ");
					String acn=save.next();
					boolean found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed.Account Not Exist.");
					}
					break;

				case 3:
					System.out.println("Enter Owner Name: ");
					acn=save.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].deposit();
							NoOfTransaction++;
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed.Account Not Exist.");
					}
					break;

				case 4:
					System.out.println("Enter Owner Name: ");
					acn=save.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].withdrawal();
							NoOfTransaction++;
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed.Account Not Exist.");
					}
					break;

				case 5:
					System.out.println("Logging Out from Bank Accounts");
					break;
			}
		}
		while(ch!=5);
	}
}