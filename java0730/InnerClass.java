//�������O
public class InnerClass
{
    public static void main(String args[])
    {
     
         InnerClass  out=new  InnerClass();   //���إߥ~�����O����out
         Caaa  in=out.new Caaa();   //�إߤ������O����in
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