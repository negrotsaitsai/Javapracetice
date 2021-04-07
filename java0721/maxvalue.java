package java0721;

import java.util.Scanner;

public class maxvalue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("a=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		
		if(a>b)
			System.out.println("最大值:"+a);
		else
			System.out.println("最大值:"+b);
	}
}