package abstractdemo;

abstract class Account
{
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract void displayBalance();
	abstract void CalculateInterest();
	double balance;
	public Account(double balance) {
		this.balance = balance;
	}
	
	
}
class SavingsAccount extends Account
{
	
	public SavingsAccount(double balance)
	{
		super(balance);
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
		displayBalance();
	}
	public void withdraw(double amount)
	{
		if(amount> balance)
		{
			System.out.println("Sorry,You are not having requested amount");
		}
		balance=balance-amount;
		displayBalance();
		
	}

	public void CalculateInterest() {
        
        double Rate = 0.15; 
        double interest = balance * Rate;
        System.out.println("Interest Earned:" + interest);
    }
	 public void displayBalance() {
	        System.out.println("Savings Account Balance:" + balance);
	    }
	
}
class CheckingAccount extends Account
{
	
	public CheckingAccount(double balance)
	{
		super(balance);
		
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
		displayBalance();
	}
	public void withdraw(double amount)
	{
		if(amount> balance)
		{
			System.out.println("Sorry,You are not having requested amount");
		}
		balance=balance-amount;
		displayBalance();
	}
	public void CalculateInterest() {
        
       
        System.out.println("nil");
    }
	 public void displayBalance() {
	        System.out.println("Checking Account Balance:" + balance);
	    }
	
}

public class Main {
	
	public static void main(String[] args)
	{
		SavingsAccount sa=new SavingsAccount(50000);
		CheckingAccount ch=new CheckingAccount(10000);
		sa.deposit(200);
		sa.withdraw(2000);
		sa.CalculateInterest();
		ch.deposit(300);
		ch.withdraw(3000);
		
	}

}
