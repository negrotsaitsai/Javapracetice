
/**
 * @(#)VarableInnerClass.java
 *
 *
 * @author 
 * @version 1.00 2010/7/22
 */
class MyOuter
{
	private  static int sx=9;   //MyOuter���O�ܼ�
	private  int x=7;   //MyOuter�����ܼ�(�����ܼ�)
	class MyInner
	{
		private int x=50;    //MyInner�������ܼ�
		public void print()
		{
			int x=100;   //�ϰ��ܼ�
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