package java0721;

import java.util.Scanner;

public class trianglearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    double s,A;
    
    System.out.print("a=");
    a=sc.nextInt();
    System.out.print("b=");
    b=sc.nextInt();
    System.out.print("c=");
    c=sc.nextInt();
    
    if(a+b>c&&b+c>a&&a+c>b)
    {
    s=(a+b+c)/2;
    A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("三角形面積:"+A);
    }
    else
    System.out.println("不能組三角形:");	
    
	}

}
