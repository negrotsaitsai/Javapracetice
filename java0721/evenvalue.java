package java0721;

import java.util.Scanner;

public class evenvalue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.print("a=");
		a=sc.nextInt();
		
		if(a%2==0)
			System.out.println("����");
		else
			System.out.println("�_��");
	}
}