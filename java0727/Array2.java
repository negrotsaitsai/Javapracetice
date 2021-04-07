
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] x= {58,63,85,72,39,61,90,70};
      int i,max,min;
      max=min=x[0];
      for(i=1;i<x.length;i++)
      {
    	  if(x[i]>max)
    	  {
    		  max=x[i];
    	  }
    	  
    	  if(x[i]<min)
    	  {
    		  min=x[i];
    	  }
    	  
      }
      System.out.println("max="+max);
      System.out.println("min="+min);
      
	}

}
