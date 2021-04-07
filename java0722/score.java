package java0722;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int s;
    System.out.print("input score:");
    s=sc.nextInt();
    if(s>=0 && s<=100)
    	if(s>=60)
    	System.out.println("及格");
    	else 
    	System.out.println("不及格");
    else
    	System.out.println("輸入錯誤");
	}

}
