package gao.mymain;

import gao.myclass.Circle;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle   c=new Circle();
        System.out.println("area:"+c.area());
        c.setr(10);
        System.out.println("area:"+c.area());
        System.out.println("length:"+c.length());
        
        
        Circle  k=new Circle(50);
        System.out.println("area:"+k.area());
        System.out.println("length:"+k.length());
        System.out.println(k.area(20));
	}

}
