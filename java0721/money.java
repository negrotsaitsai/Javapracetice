package java0721;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money;
		double sum,rate;
		System.out.print("�п�J����:");
		money=sc.nextInt();
		System.out.print("�Q�v:");
		rate=sc.nextDouble();
		sum=money*(1+rate);
		System.out.println("���Q�M:"+sum);
	}
}