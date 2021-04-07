public class StaticNested   
{
   public static void main(String args[])
   {
      Caaa aa= new Caaa();    //直接建立靜態巢狀類別物件
     // StaticNested.Caaa aa=new StaticNested.Caaa();
      aa.set_num(5);
   }

  static class Caaa    //靜態巢狀類別
  {
    int num;
    void set_num(int n)
    {
        num=n;
        System.out.println("num= "+ num);
    }
  }
}