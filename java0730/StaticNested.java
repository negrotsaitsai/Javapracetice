public class StaticNested   
{
   public static void main(String args[])
   {
      Caaa aa= new Caaa();    //�����إ��R�A�_�����O����
     // StaticNested.Caaa aa=new StaticNested.Caaa();
      aa.set_num(5);
   }

  static class Caaa    //�R�A�_�����O
  {
    int num;
    void set_num(int n)
    {
        num=n;
        System.out.println("num= "+ num);
    }
  }
}