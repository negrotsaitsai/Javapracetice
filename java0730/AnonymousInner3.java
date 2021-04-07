
class Popcorn
{
	public void pop()
	{
		System.out.println("Popcorn");
	}
}
class Food
{
	Popcorn  p=new Popcorn()
	{
		public void pop()   //ÂÐ»\¦Û¤vpop()
		{
			System.out.println("anonymous Popcorn");
		}
	};
	void print()
	{
		p.pop();
	}
}
public class AnonymousInner3
{
   public static void main(String[]  args)
   {
   	  Food  f=new Food();
   	  f.print();
   }
}

