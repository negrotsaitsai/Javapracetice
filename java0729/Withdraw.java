package gao.myclass;

public class Withdraw extends Bank{
	 public Withdraw()
	 {
	    	
	 }
	 public Withdraw(String a,int b)
	 {
	   	super(a,b);  //�I�s�����O�غc�l
	 }
	 public void getMoney(int x)
	 {
	   if(x>getBalance())
	   System.out.println("����"+x+"��,�s�ڤ���,���ണ��");
	   else
	    super.getMoney(x);
     }
}