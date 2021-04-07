
public class throwExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // System.out.println(Math.sqrt(-5));
		try {
			System.out.println(SquareRoot(5));
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
	}
	public static double SquareRoot(int s)
	{
		if(s<0)
			throw new ArithmeticException("不可以負數");
		else
			return Math.sqrt(s);
	}
	
	

}
