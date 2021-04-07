import java.util.Scanner;

public class BankLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  account= {"peter","bill","jackie","mary","andy"};
	    int[]  balance= {12000,8000,25000,6000,38000};
	      String user;
	      int money;
	      Scanner  sc=new Scanner(System.in);
	      System.out.print("帳號:");
	      user=sc.next().toLowerCase();
	      System.out.print("提款金額:");
	      money=sc.nextInt();
	      int i;
	   
	      for(i=0;i<account.length;i++)
	      {
	    	  if(account[i].equals(user))
	    	  {
	    		  System.out.println("存款:"+balance[i]);
	    		  if(balance[i]>=money)
	    		  {
	    			  balance[i]-=money;
	    			  System.out.println("餘額:"+balance[i]);
	    		  }
	    		  else
	    			  System.out.println("存款不足,不能提款...");
	    		  break;
	    	  }
	      }
	      if( i==account.length )
	          System.out.println("account error");
	      
	}

}
