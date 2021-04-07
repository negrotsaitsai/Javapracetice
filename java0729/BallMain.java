package gao.mymain;

import gao.myclass.Ball;

public class BallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Ball b=new Ball(10);
    System.out.println("area:"+b.area());
    System.out.println("length:"+b.length());
    System.out.println("Ball area:"+b.BallArea());
    System.out.println("Ball Volume:"+b.BallVolume());
	}
}
