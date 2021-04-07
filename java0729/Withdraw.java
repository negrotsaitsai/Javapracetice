package gao.myclass;

public class Withdraw extends Bank{
	 public Withdraw()
	 {
	    	
	 }
	 public Withdraw(String a,int b)
	 {
	   	super(a,b);  //呼叫父類別建構子
	 }
	 public void getMoney(int x)
	 {
	   if(x>getBalance())
	   System.out.println("提款"+x+"元,存款不足,不能提款");
	   else
	    super.getMoney(x);
     }
}