package java0722;

import java.util.Scanner;

public class score_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int s;
		 System.out.print("input score:");
		 s=sc.nextInt();
	  if(  s>=0 && s<=100  )
		    
		 if(s>=90)
				System.out.println("A");
		 else if(s>=80)
		    	System.out.println("B");
		 else if(s>=70)
		    	System.out.println("C");
		 else if(s>=60)
		    	System.out.println("D");
		 else
			    System.out.println("E");
	  else
		        System.out.println("¿é¤J¿ù»~");
		     
				
		   
	}

}
