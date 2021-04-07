
class mytest implements AutoCloseable
{
   public void print()
   {
	   System.out.println("hello");
   }

  @Override
  public void close() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("¦Û°ÊÃö³¬");
   }
}


public class AutoClosable_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try( mytest a=new mytest(); )
	{
		a.print();
		System.out.println("end");
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
}