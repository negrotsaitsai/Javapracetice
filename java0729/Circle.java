package gao.myclass;

public class Circle {
    //成員變數
	public int r;  //宣告
	
	//建構子
	public Circle()   //預設建構子
	{
		r=0;
	}
	public Circle(int r)
	{
		//每個類別都有this,表示自己
		this.r=r;
	}
	
	//方法
	public void setr(int x)  //設定半徑
	{
		r=x;  
	}
	public double area()
	{
		return Math.PI*Math.pow(r, 2);
	}
	public double length()
	{
		return 2*Math.PI*r;
	}
	public double area(int x)
	{
		return Math.PI*Math.pow(x, 2);
	}
	
	
	
}
