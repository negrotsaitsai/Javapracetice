import java.util.Scanner;

public class break_continueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner  sc=new Scanner(System.in);
	   int n,sum=0;	
		
		do {
			System.out.print("input n:");
			n=sc.nextInt();
			if(n<0)
			{
				System.out.println("輸入錯誤,必須正數");
				continue;
			}
			if(n==0)
			{
				break;
			}
		    sum+=n;
			System.out.println("sum="+sum);
		}while(true);
		System.out.println("***sum="+sum);
		
		
		
		
		
	}

}
