/**
 * @(#)StaticInnerClass.java
 *
 *
 * @author 
 * @version 1.00 2010/7/23
 */

class MyOuter2
{
	private int x=7;
    private static  int sx=9;
	static class MyStatic
	{
		private int x=50;
		private static int sx=99;
		public void funA()
		{
			System.out.println(sx);
			System.out.println(MyOuter2.sx);
			System.out.println(x);
			System.out.println(this.x);
		//	System.out.println(MyOuter.this.x);
		}
		public static void funB()
		{
			System.out.println(sx);
			System.out.println(MyOuter2.sx);
		}
	}
}
public class StaticInnerClass {

    public StaticInnerClass() {
    }
    public static void main (String[] args) {
    	MyOuter2.MyStatic  s=new MyOuter2.MyStatic();
    	s.funA();
    	//s.funB();
}
    
}