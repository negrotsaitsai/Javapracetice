package java0721;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("2020/07/21");
		
		Hello c=new Hello();
		c.funC();   //呼叫方法
		
		byte x;
		x=127;
		System.out.println("x="+x);
		
		short y;
		y=32767;
		System.out.println("y="+y);
		
		int z;
		z=2147483647;
		System.out.println("z="+z);
		
		long w;
		w=214748648L;
		System.out.println("w="+w);
		
		float e=25.79f;
		System.out.println("e="+e);
		
		double g=25/7.0;
		System.out.println("g="+g);
		
		float h=25/7f;
		System.out.println("h="+h);
		
		char i='A';
		System.out.println("i="+i);
		
		i=(char)(i-3);
		System.out.println("i="+i);
		
		boolean j;
		j=12>9;
		System.out.println("j="+j);
		j=!(12>9);
		System.out.println("j="+j);
		
		System.out.println(25/7);
		System.out.println(25/7.0);
		System.out.println(25%7);
	}
	public void funC()
	{
		System.out.println("我是funC");
	}
}