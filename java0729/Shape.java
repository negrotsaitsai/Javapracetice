package mytool;
//import mytool.Rectangle;
public class Shape extends Circle
{
	Shape(int r)
	{
		super(r);
	}
	public static void main(String[]  args)
	{
		Shape  a=new Shape(10);

		System.out.println(a.area());   //同一包裝且有繼承
		
		Rectangle  r=new Rectangle(5,8);    //同一包裝,沒有繼承
		System.out.println(r.area());
		
	}
}
