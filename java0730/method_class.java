 //方法內部類別
public class method_class
{
	private String x="Outer2";
	void doStuff()
	{
		class MyInner
		{
			public void seeOuter()
			{
				System.out.println("Outer x is "+x);
			}
		}
		MyInner  mi=new  MyInner();
		mi.seeOuter();
	}
	public static void main(String[]  args)
	{
		method_class   a=new  method_class();
		a.doStuff();
	}
	
}
