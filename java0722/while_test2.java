package java0722;

import java.util.Scanner;

public class while_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,n;
    double sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("input n:");
    n=sc.nextInt();
    i=1;
    while(i<=n)
    {
    	sum+=(double)i/n;
    	System.out.println(i+"/"+n+"="+(double)i/n+ "    sum="+sum);
    	i++;
    }
	}

}
