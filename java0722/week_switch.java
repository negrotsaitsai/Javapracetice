package java0722;

import java.util.Scanner;

public class week_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("�^���Y�g:");
    String w=sc.next().toLowerCase();
    switch(w)
    {
     case "mon":
    	  System.out.println("�P���@");
    	  break;
     case "tue":
   	  System.out.println("�P���G");
   	  break;
     case "wed":
   	  System.out.println("�P���T");
   	  break;
     case "thu":
   	  System.out.println("�P���|");
   	  break;
     case "fri":
   	  System.out.println("�P����");
   	  break;
     case "sat":
   	  System.out.println("�P����");
   	  break;
     case "sun":
   	  System.out.println("�P����");
   	  break;
   	 default:
      System.out.println("��J���~");
    }
	}

	private static void toLowerCase() {
		// TODO Auto-generated method stub
		
	}
}
