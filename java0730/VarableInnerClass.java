
/**
 * @(#)VarableInnerClass.java
 *
 *
 * @author 
 * @version 1.00 2010/7/22
 */
class MyOuter
{
	private  static int sx=9;   //MyOuter類別變數
	private  int x=7;   //MyOuter物件變數(成員變數)
	class MyInner
	{
		private int x=50;    //MyInner的成員變數
		public void print()
		{
			int x=100;   //區域變數
			System.out.println("Local x="+x);
			System.out.println("MyInner's x="+this.x);
			System.out.println("MyOuter's x="+MyOuter.this.x);
			System.out.println("MyOuter's sx="+MyOuter.sx);
		}
	}
}

public class VarableInnerClass {

    public VarableInnerClass() {
    }
    public static void main (String[] args) {
    	new MyOuter().new MyInner().print();
    }
    
}