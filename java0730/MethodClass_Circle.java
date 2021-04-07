
public class MethodClass_Circle {

	public double CircleArea(int r)
	{
		class Circle
		{
			int radius;

			public Circle(int radius) {
				super();
				this.radius = radius;
			}
			public double Area()
			{
				return Math.PI*Math.pow(radius, 2);
			}
		}
		
		Circle   c=new Circle(r);
		double a=c.Area();
		return a;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodClass_Circle  test=new MethodClass_Circle();
		System.out.println("Area:"+test.CircleArea(10));
	}

}
