
public class Flower2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,a,b,c;
       for(i=100;i<=999;i++)
       {
    	   a=i/100;
    	   b=i/10%10;
    	   c=i%10;
    	   if(Math.pow(a,3)+Math.pow(b, 3)+Math.pow(c, 3)==i)
    		   System.out.println(i);
    		   
       }
	}

}
