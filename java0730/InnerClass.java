//內部類別
public class InnerClass
{
    public static void main(String args[])
    {
     
         InnerClass  out=new  InnerClass();   //先建立外部類別物件out
         Caaa  in=out.new Caaa();   //建立內部類別物件in
         in.set_num(10);
         
         Caaa  in2=new InnerClass().new Caaa();
         in2.set_num(50);
    }

    class Caaa
    {
      int num;
      void set_num(int n)
      {
        num=n;
        System.out.println("num= "+ num);
      }
}
    }