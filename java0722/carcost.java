package java0722;

import java.util.Scanner;

public class carcost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int i,diff,cost;
    System.out.print("¨½µ{¼Æ:");
    i=sc.nextInt();
     if(i<=1500)
    	cost=70;
     else
     {	 
    	diff=i-1500;
      if(diff%500==0)
    	cost=70+(diff/500)*5;
      else
    	cost=70+((diff/500)+1)*5;
    	}
      System.out.println("cost:"+cost);
   }
 }