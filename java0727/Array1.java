import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
       int[] a=new int[6];
       int i;
       double tal=0,avg;
       for(i=0;i<6;i++)
       {
    	   System.out.print("a["+i+"]=");
    	   a[i]=sc.nextInt();
    	   tal+=a[i];
       }
       avg=tal/6;
       System.out.println("tal="+tal);
       System.out.println("avg="+avg);
       
       
	}

}
