package java0721;

import java.util.Scanner;

public class STD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double h,w;
		char gender;
		System.out.print("����:");
		h=sc.nextDouble();
		System.out.print("�ʧO(m/f):");
		gender=sc.next().charAt(0);
		if(gender=='m' || gender=='M')
			w=(h-80)*0.7;
		else
			w=(h-70)*0.6;
		System.out.println("�з��魫:"+w);	
	}
}