package gao.mymain;

import java.util.Scanner;

import gao.myclass.Body;

public class BodyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    double h,w;
    boolean sex;
    System.out.print("hight:");
    h=sc.nextDouble();
    System.out.print("weight:");
    w=sc.nextDouble();
    System.out.print("sex:");
    sex=sc.nextBoolean();
    Body b=new Body(h,w,sex);
    System.out.println("bmi="+b.bmi());
    System.out.println("StdWeight="+b.StdWeight());   
	}
}
