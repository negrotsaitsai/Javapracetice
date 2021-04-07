package  mytool;
public class Circle
{
	int r;
	Circle(int r)
	{
		this.r=r;
	}
	double area()
	{
		return 3.14159*Math.pow(r,2);
	}
}