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

		System.out.println(a.area());   //�P�@�]�˥B���~��
		
		Rectangle  r=new Rectangle(5,8);    //�P�@�]��,�S���~��
		System.out.println(r.area());
		
	}
}
