//p475  �R�A�_�����O
class BigOuter
{
	static class Nested
	{
		void print()
		{
			System.out.println("Nested");
		}
	}
}
public class StaticNested2  
{
   public static void main(String args[])
   {
       BigOuter.Nested  n=new  BigOuter.Nested();
       n.print();
   }
}   