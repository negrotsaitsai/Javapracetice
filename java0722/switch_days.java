package java0722;

import java.util.Scanner;

public class switch_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int y,m;
    System.out.print("�褸�~:");
    y=sc.nextInt();
    System.out.print("���:");
    m=sc.nextInt();
    switch(m)
    {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
    	 System.out.println("31��");
    	 break;
    case 4:
    case 6:
    case 9:
    case 11:
         System.out.println("30��");
         break;
    case 2:
    	 if(y%4==0 && y%100!=0 || y%400==0)
    		 System.out.println("29��");
    	 else
    		 System.out.println("28��");
    	 break;
    default:
    	     System.out.println("��J���~");
    } 	 
    }

}
