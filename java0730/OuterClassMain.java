package gao.mymain;
class OuterClass1
{
	 int i;
	OuterClass1(int initValue)
	{
		i=initValue;
	}
	public class InnerClass1
	{
		public void amethod(int add)
		{
			OuterClass1.this.i+=add;
			
		}
	}
	
}
public class OuterClassMain
{
	public static void main(String[] args)
	{
		OuterClass1 Ou = new OuterClass1(5);
		System.out.println(Ou.i);
		OuterClass1.InnerClass1 In = Ou.new InnerClass1();
		//�]�D�{���M�I�s������b���Pclass��  �ҥH�n�g�X���㪺���|
		In.amethod(10);
		System.out.println(Ou.i);
	}
}