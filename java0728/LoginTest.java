import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[]  account= {"peter","bill","jackie","mary","andy"};
      String[]  password= {"p123","b123","j123","m123","a123"};
      String user,pwd;
      Scanner  sc=new Scanner(System.in);
      System.out.print("±b¸¹:");
      user=sc.next().toLowerCase();
      System.out.print("±K½X:");
      pwd=sc.next().toLowerCase();
      int i;
      boolean find=false;
      for(i=0;i<account.length;i++)
      {
    	  if(account[i].equals(user))
    	  {
    		  find=true;
    		  if(password[i].equals(pwd))
    			  System.out.println("welcome");
    		  else
    			  System.out.println("password error");
    		  break;
    	  }
    	
    		  
      }
      if ( find==false )
          System.out.println("account error");
      
	}

}
