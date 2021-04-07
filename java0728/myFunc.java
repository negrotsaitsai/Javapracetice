import static java.lang.Math.*;

class myString{
	public static String Reverse(String str)
	{
		char[] tmp=new char[str.length()];		
		int i,j;
		for(i=str.length()-1,j=0; i>=0 ; i--,j++)
		{
			tmp[j]=str.charAt(i);
		}
		return new String(tmp);
	}
	
}


public class myFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(myFunc.triangle(8, 9));
        System.out.println(triangle(7,9));
        System.out.println(pow(2,3));
        System.out.println(random());
        
        System.out.println(myString.Reverse("hello"));
        
	}
	
	public static double triangle(int base,int high)
	{
		return (base*high)/2.0;
	}
	

}
