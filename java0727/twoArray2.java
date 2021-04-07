
public class twoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] a= { {1,1,2} ,     		   
    		        {0,2,0}   };
       int[][]  b= { {0,0,1} ,
    		         {2,1,1}  };
       int[][]  c=new int[2][3];
       
       int i,j;
       for(i=0;i<a.length;i++)
       {
    	   for(j=0;j<a[i].length;j++)
    	   {
    		   c[i][j]=a[i][j]+b[i][j];
    		   System.out.print(c[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}

}
