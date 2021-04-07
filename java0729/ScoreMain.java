package gao.mymain;

import java.util.Scanner;

import gao.myclass.Score;

public class ScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int c,e,m;
    
    c=Integer.parseInt(args[0]); 
    e=Integer.parseInt(args[1]);
    m=Integer.parseInt(args[2]);
   /* 
    System.out.print("chinese:");
    c=sc.nextInt();
    System.out.print("english:");
    e=sc.nextInt();
    System.out.print("math:");
    m=sc.nextInt();
    */
    Score   s=new Score(c,e,m);
    System.out.println("tal:"+s.tal());
    System.out.println("avg:"+s.avg());
	}
}