import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
       int n,sum=0,i;
       for(i=1;i<=5;i++)
       {
    	   try {
	    	   System.out.print("input n:");
	    	   n=sc.nextInt();
	    	   sum+=n;
	    	   System.out.println("sum="+sum);
    	   }catch(InputMismatchException e)
    	   {
    		   System.out.println(e);
    		   sc=new Scanner(System.in);
    	   }
       }
	}

}
