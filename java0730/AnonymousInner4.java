//p471
interface Cookable
{
	public void cook();
}

class Food2 
{
	Cookable c=new Cookable()  //�۷��implement Cookable����
	{
		public void cook()
		{
			System.out.println("anonymous cookable implementer");
		}
	};
}
public class AnonymousInner4
{
   public static void main(String[]  args)
   {
   	  Food2  f=new Food2();
   	  f.c.cook();   //�`�N
   }
}   	  