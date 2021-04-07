class shape
{
	public double Area()
	{
		return 0.0;
	}
}
class Triangle extends shape
{
	int base,high;
	
	public Triangle(int base, int high){
		super();
		this.base = base;
		this.high = high;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return base*high/2.0;
	}
}
class Rectangle extends shape
{
   int l,w;
   
   public Rectangle(int l, int w){
	   super();
		this.l = l;
		this.w = w;
   }

    @Override
    public double Area() {
	// TODO Auto-generated method stub
	return l*w;
}
}

public class PloymorphismTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s;
		Triangle t=new Triangle(9,7);
		Rectangle r=new Rectangle(8,6);
		s=t;
		System.out.println(s.Area());
		s=r;
		System.out.println(s.Area());
		
		shape s2=new Triangle(9,3);
		System.out.println(s2.Area());
}
}