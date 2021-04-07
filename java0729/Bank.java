package gao.myclass;

public class Bank {
   //成員變數
	private String account;
	private int balance;
	//建構子
	public Bank(String a,int b)
	{
		account=a;
		balance=b;		
	}
	public Bank()
	{
    
	}
	//方法
	public String getAccount()
	{
		return account;
	}
	public int getBalance()
	{
		return balance;
	}
	public void getMoney(int m)
	{
		System.out.println("提款:"+m+"元");
		balance-=m;		
	}
	public void Saving(int m)
	{
		System.out.println("存款:"+m+"元");
		balance+=m;	
	}
	
	
	
	
	
	
	
	
	
}
