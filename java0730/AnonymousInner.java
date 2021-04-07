//匿名類別
public class AnonymousInner
{
   public static void main(String args[])
   {
     (
       new Caaa()  //new 物件的同時,另外再定義set_num()方法
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

   static class Caaa    //靜態巢狀類別
   {
      int num;
   }
}
