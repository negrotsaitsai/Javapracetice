import java.util.Scanner;

class Drink{
	
	public static void Menu()
	{
		System.out.println("1.紅茶25元");
		System.out.println("2.綠茶30元");
		System.out.println("3.咖啡45元");
		System.out.println("4.奶茶35元");
		System.out.print("請選擇:");
	}
	public int tal(int item,int qty)
	{
		int[] price= {0,25,30,45,35};
		return price[item]*qty;		
	}
	public double discount(int m)
	{
		if(m>=500)
			return m*0.9;
		else
			return m*0.95;
	}
	
}


public class DrinkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner  sc=new Scanner(System.in);
       int item,q;
       Drink.Menu();
       item=sc.nextInt();
       System.out.print("數量:");
       q=sc.nextInt();
       Drink  dr=new Drink();
       int money=dr.tal(item,q);    
       System.out.println("小計:"+money);
       double dis=dr.discount(money);
       System.out.println("折扣價;"+dis);
       
	}

}
