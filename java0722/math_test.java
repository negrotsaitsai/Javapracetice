package java0722;

import java.util.Scanner;

public class math_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int a,b,c;
       System.out.print("a=");
      a=sc.nextInt();
      System.out.print("b=");
      b=sc.nextInt();
      System.out.print("c=");
      c=sc.nextInt();
      double x1,x2,tmp;
      if(a!=0)
      {
    	 tmp=Math.pow(b,2)-4*a*c;
    	 if(tmp<0)
    		 System.out.println("無解");
    	 else if(tmp>0)
    	 {
              x1=(-b+Math.sqrt(tmp))/(2*a);
              x2=(-b-Math.sqrt(tmp))/(2*a);
              System.out.println("有兩解:"+1+" , "+x2);
         }	 
    	 else
    	 {
    		 x1=-b/(2*a);
    		 System.out.println("有一解:"+1);
    	}
      }	  
      else
    	  System.out.println("輸入錯誤,a必須不為0");
	}

}
