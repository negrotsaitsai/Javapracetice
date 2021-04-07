import java.util.Scanner;

public class LoginPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner  sc=new Scanner(System.in);
        int pwd,i;
      for(i=1;i<=3;i++)
      {
        System.out.print("input password:");
        pwd=sc.nextInt();
        if(pwd==7360)
        {
        	System.out.println("welcome");
        	break;
        }
        else
        	System.out.println("error");
      }
	}

}
