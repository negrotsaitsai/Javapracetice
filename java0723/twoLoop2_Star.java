
public class twoLoop2_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        for(i=1;i<=7;i++)
        {
        	for(j=1;j<=4;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        for(i=1;i<=9;i++)
        {
        	for(j=1;j<=9;j++)
        	{
        		System.out.print(i+"*"+j+"="+i*j+" ");
        	}
        	System.out.println();
        }
        
        for(i=1;i<=7;i++)
        {
        	for(j=1;j<=i;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        
	}

}
