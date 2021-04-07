package gao.myMain;

import gao.mybook.Discount;

public class DiscountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Discount  d=new Discount("A0123","Java 8",700,50,1000);
	      System.out.println("Num:"+d.getNum());
	      System.out.println("Name:"+d.getName());
	      System.out.println("Price:"+d.getPrice());
	      System.out.println("Qty:"+d.getQty());
	      System.out.println("Car:"+d.getCar());
	      System.out.println("Discount:"+d.tal());
	}
}