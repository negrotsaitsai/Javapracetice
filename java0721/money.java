package java0721;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money;
		double sum,rate;
		System.out.print("請輸入本金:");
		money=sc.nextInt();
		System.out.print("利率:");
		rate=sc.nextDouble();
		sum=money*(1+rate);
		System.out.println("本利和:"+sum);
	}
}