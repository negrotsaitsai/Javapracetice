package java0722;

import java.util.Scanner;

public class for_test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner  sc=new Scanner(System.in);
	       int i,sum=0,n;
	     
	       for(i=1;i<=5;i++)
	       {
	    	   System.out.print("input number:");
	    	   n=sc.nextInt();
	    	   if(n%2==0)
	    	   {
	    		   sum+=n;
	    		   System.out.println("sum="+sum);
	    	   }
	    	   else
	    		   System.out.println("¬O©_¼Æ,¿é¤Jerror");
	       }
	       System.out.println("***sum="+sum);
	       
		}

	}

	


