//�ΦW���O
public class AnonymousInner
{
   public static void main(String args[])
   {
     (
       new Caaa()  //new ���󪺦P��,�t�~�A�w�qset_num()��k
       {
          void set_num(int n)
          {
            num=n;
            System.out.println("num= "+ num);
          }
       }
     ).set_num(5);
    new Caaa()
    {
    	public void print(String name)
    	{
    		System.out.println("Hello "+name);
    	}
    }.print("jackie");
   }

   static class Caaa    //�R�A�_�����O
   {
      int num;
   }
}
