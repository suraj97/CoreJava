

class Account{
	String names;
	protected double balance;


	public Account(String names, double balance) {
	super();
	this.names = names;
	this.balance = balance;
}

	public String getNames() {
		return names;
	}
	public double getBalance() {
		return balance;
	}
 void deposit(double amt)
 {
	 balance += amt;
	 System.out.println("Depositing:"+amt);
 }
 void withdraw(double amt)
 {
	 balance -= amt;
	 System.out.println("Withdrawing:"+amt);
 }
}

class SavingsAccount extends Account
{
	double interestRate;
	
	SavingsAccount(String str,double amt,double rate)
	{
		super(str,amt);
		interestRate=rate;
	}
}
class CheckingAccount extends Account
{
	double overDraft;
	
	CheckingAccount(String str,double amt,double draft)
	{
		super(str,amt);
		overDraft=draft;
	}
	void withdraw(double amt)
	{
		System.out.println("Overdraft Amount"+overDraft);
		
		if(amt<=balance)
		{
			balance -=amt;
			System.out.println("Withdrawing:" +amt);
		}
		else if((amt>balance) && (amt>(balance+overDraft)))
		{
			System.out.println("Sorry! you cannot withdraw");
		}
		else
		{
			double result=amt-balance;
			overDraft -=result;
			balance=0;
			System.out.println("Withdrawing:"+amt);
			System.out.println("Current Overdraft amount:"+overDraft);
		}
	}
		
	}

public class AccountTest {
	public static void main(String[] args)
	{
		SavingsAccount sAccountObj = new SavingsAccount("John",500,4);
		System.out.println("\n Savings Account Details");
		System.out.println("---------------------");
		System.out.println(""+ sAccountObj.getNames()+"has an initial balance of:"+sAccountObj.getBalance());
		
		sAccountObj.deposit(200);
		sAccountObj.withdraw(200);
		System.out.println(""+sAccountObj.getNames()+" at the end of transaction has a balance of:"+sAccountObj.getBalance());
		System.out.println("\n Checking Account Details");
		System.out.println("---------------------");
		
		CheckingAccount cAccountObj=new CheckingAccount("Stephen",200,200);
		System.out.println(""+cAccountObj.getNames()+"has an intital balance of:"+cAccountObj.getBalance());
		cAccountObj.deposit(200);
		cAccountObj.withdraw(500);
		System.out.println(""+cAccountObj.getNames()+" at the end transaction has a balance of :"+cAccountObj.getBalance());
		
			
	}

}
