
public class twoArray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][]   x=new int[5][];
        x[0]=new int[2];
        x[1]=new int[3];
        x[2]=new int[6];
        x[3]=new int[4];
        x[4]=new int[3];
        
        int i,j;
        for(i=0;i<x.length;i++)
        {
        	for(j=0;j<x[i].length;j++)
        	{
        		x[i][j]=i+j;
        		System.out.print(x[i][j]+" ");
        	}
        	System.out.println();
        }
        
        
	}

}
