package java0721;

import java.util.Scanner;

public class ceTOfa {

	public static void main(String[] args) {
		int ce=26;
		double fa;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("½Ð¿é¤JÄá¤ó:");
		ce=sc.nextInt();
		fa=ce*9/5.0+32;
		System.out.println("Äá¤ó:"+ce);
		System.out.println("µØ¤ó:"+fa);
	}
}