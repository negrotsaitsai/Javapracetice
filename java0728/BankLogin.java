import java.util.Scanner;

public class BankLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  account= {"peter","bill","jackie","mary","andy"};
	    int[]  balance= {12000,8000,25000,6000,38000};
	      String user;
	      int money;
	      Scanner  sc=new Scanner(System.in);
	      System.out.print("�b��:");
	      user=sc.next().toLowerCase();
	      System.out.print("���ڪ��B:");
	      money=sc.nextInt();
	      int i;
	   
	      for(i=0;i<account.length;i++)
	      {
	    	  if(account[i].equals(user))
	    	  {
	    		  System.out.println("�s��:"+balance[i]);
	    		  if(balance[i]>=money)
	    		  {
	    			  balance[i]-=money;
	    			  System.out.println("�l�B:"+balance[i]);
	    		  }
	    		  else
	    			  System.out.println("�s�ڤ���,���ണ��...");
	    		  break;
	    	  }
	      }
	      if( i==account.length )
	          System.out.println("account error");
	      
	}

}
