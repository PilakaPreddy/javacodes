package labweek4codes;

public class Account {
	private int id,balance;
	Account()
	{
		id=0;
		balance=0;
	}
	Account(int n,int amt)
	{
		id=n;
		balance=amt;
	}
	boolean setId(int n)
	{
		id=n;
		if(id<0)
			return true;
		else
			return false;
	}
	int getId()
	{
		return id;
	}
	int getbalance()
	{
		return balance;
	}
	void withdraw(int amt)
	{
		balance=balance-amt;
		
	}
	void deposit(int amt)
	{
		balance=balance+amt;
	}
	public String toString()
	{
		return "ID :"+getId()+"\nBalance Amount :"+getbalance();
	}

}
