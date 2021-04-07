package java0722;

import java.util.Scanner;

public class week_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("英文縮寫:");
    String w=sc.next().toLowerCase();
    switch(w)
    {
     case "mon":
    	  System.out.println("星期一");
    	  break;
     case "tue":
   	  System.out.println("星期二");
   	  break;
     case "wed":
   	  System.out.println("星期三");
   	  break;
     case "thu":
   	  System.out.println("星期四");
   	  break;
     case "fri":
   	  System.out.println("星期五");
   	  break;
     case "sat":
   	  System.out.println("星期六");
   	  break;
     case "sun":
   	  System.out.println("星期日");
   	  break;
   	 default:
      System.out.println("輸入錯誤");
    }
	}

	private static void toLowerCase() {
		// TODO Auto-generated method stub
		
	}
}
