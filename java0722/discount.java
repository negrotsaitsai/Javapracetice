package java0722;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    char vip;
    int money;
    double tal;
    System.out.print("會員(y/n):");
    vip=sc.next().charAt(0);
    System.out.print("金額:");
    money=sc.nextInt();
    if(vip=='y' || vip=='y' )
         if(money>=5000)
        	        tal=money*0.7;
         else
        	        tal=money*0.85;
    else
    	            tal=money*0.9;
    System.out.println("折扣價:"+tal);	            	
	}

}
