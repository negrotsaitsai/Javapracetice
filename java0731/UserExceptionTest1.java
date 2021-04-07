class isTriangle extends Exception
{
	int a,b,c;

	public isTriangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a+","+b+","+c+"可以組成三角形";
	}
	
}
class notTriangle extends Exception
{
	int a,b,c;

	public notTriangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  a+","+b+","+c+"不能組成三角形";
	}
	
	
}



public class UserExceptionTest1 {

	public static void main(String[] args) //throws isTriangle,notTriangle
	{
		// TODO Auto-generated method stub
        int a=1,b=1,c=1;
        try {
	        if(a+b>c && b+c>a  && a+c>b)
	        	throw new isTriangle(a,b,c);
	        else
	        	throw new notTriangle(a,b,c);
        }
	     catch(isTriangle |  notTriangle e)
	     {
	    	 System.out.println(e);
	     }
	}

}
