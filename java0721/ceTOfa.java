package java0721;

import java.util.Scanner;

public class ceTOfa {

	public static void main(String[] args) {
		int ce=26;
		double fa;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�J���:");
		ce=sc.nextInt();
		fa=ce*9/5.0+32;
		System.out.println("���:"+ce);
		System.out.println("�ؤ�:"+fa);
	}
}