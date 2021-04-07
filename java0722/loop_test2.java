package java0722;

public class loop_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=5;
        double sum=0;
        while(j<=100)
        {
        	sum+= (double)i/j;
        	System.out.println(i+"/"+j+"="+(double)i/j);
        	i+=2;
        	j+=5;
        }
        System.out.println("sum="+sum);
	}

}
	


