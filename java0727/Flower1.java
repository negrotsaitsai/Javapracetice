
public class Flower1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j,k;
        for(i=1;i<=9;i++)
        {
        	for(j=0;j<=9;j++)
        	{
        		for(k=0;k<=9;k++)
        		{
        			
        			if(Math.pow(i,3)+Math.pow(j, 3)+Math.pow(k, 3)==i*100+j*10+k)
        				System.out.println(i*100+j*10+k);
        		}
        	}
        }
	}

}
