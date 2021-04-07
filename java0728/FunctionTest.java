
class Area{
	
	public double Circle(int r)
	{
		return Math.PI*r*r;
	}
	
	public int Rectangle(int l,int w)
	{
		return l*w;
	}
	
	
}

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FunctionTest   a=new FunctionTest();
       System.out.println(a.f(2));	  //呼叫方法
       
       System.out.println("BMI="+a.BMI(170, 81));
       
       Area  k=new Area();
       System.out.println("circle:"+k.Circle(10));
       System.out.println("Rectangle:"+k.Rectangle(9, 5));
       
       a.print(25);
       a.print(30);
       
		
	}
	
	public int f( int   x)
	{
		int ans;
		ans=x*x+5;
		return ans;   //回傳結果
	}
	
	public double BMI(int h,int w)
	{
		double x=h/100.0;
		return w/Math.pow(x, 2);
	}
	
	public void print(int age)
	{
		System.out.println("我今年"+age+"歲");
	}
	

}
