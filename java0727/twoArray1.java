
public class twoArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][]   a=new int[3][4];
       int i,j;
       for(i=0;i< a.length; i++)  // a.length ¦Cªºªø«×
       {
    	   for(j=0;j<a[i].length;j++)
    	   {
    		   a[i][j]=i+j;
    		   System.out.println("a["+i+"]["+j+"]="+a[i][j]);    		   
    	   }
       }
	}

}
