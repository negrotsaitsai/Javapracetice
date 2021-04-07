
class myProgram
{
	public void star(int row,int col)
	{
		int i,j;
		for(i=1;i<=row;i++)
		{
			if(i==1 || i==row)
				for(j=1;j<=col;j++)
					System.out.print("*");
			else
				for(j=1;j<=col;j++)
				{
					if(j==1 || j==col)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			System.out.println();
		}
	}
	
	
}
public class myFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        myProgram   m=new myProgram();
        m.star(7, 4);
        
        myFunction x=new myFunction();
        System.out.println(x.ceTofa(26));
        
        System.out.println("C(5,2)="+ x.f(5)/(x.f(2)*x.f(5-2)));
        
	}
	
	public double ceTofa(int ce)
	{
		double fa;
		fa=ce*9/5.0+32;
		return fa;
	}
	public int f(int x)
	{
		int i,sum=1;
		for(i=1;i<=x;i++)
			sum*=i;
		
		return sum;
	}
	
	

}
