import java.util.Scanner;

public class twoArray5_Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		System.out.print("input n:");
		int n=sc.nextInt();
		int[][]  a=new int[n][n];
		int i,j,sum=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=(int)(Math.random()*10+0);
				System.out.print(a[i][j]+" ");
				if(i==j)
					sum+=a[i][j];
			}
			System.out.println();
		}
		System.out.println("sum="+sum);
		
	}

}
