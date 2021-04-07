package java0722;

import java.util.Scanner;

public class score_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int s;
    System.out.print("input score:");
    s=sc.nextInt();
    if( s>=0 && s<=100 )
    	
      switch(s/10)
      {
      case 9:
      case10:
    	    System.out.println("A");
      case 8:
    	    System.out.println("B");
      case 7:
    	    System.out.println("C");
      case 6:
    	    System.out.println("D");
      default:
    	    System.out.println("E");
      }
    else
    	    System.out.println("¿é¤J¿ù»~");
	}
}