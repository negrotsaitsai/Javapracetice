package gao.myclass;

public class Bank {
   //�����ܼ�
	private String account;
	private int balance;
	//�غc�l
	public Bank(String a,int b)
	{
		account=a;
		balance=b;		
	}
	public Bank()
	{
    
	}
	//��k
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
		System.out.println("����:"+m+"��");
		balance-=m;		
	}
	public void Saving(int m)
	{
		System.out.println("�s��:"+m+"��");
		balance+=m;	
	}
	
	
	
	
	
	
	
	
	
}
