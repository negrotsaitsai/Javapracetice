package java0721;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double high;
		double weight;
		System.out.print("�п�J����(m):");
		high=sc.nextDouble();
		System.out.print("�п�J�魫:");
		weight=sc.nextDouble();
		double BMI;
		BMI=weight/(high*high);
		System.out.print("BMI="+BMI);
	}
}