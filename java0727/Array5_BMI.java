
public class Array5_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]  h= {165,158,172,162,187};
       int[]  w= {72,63,65,78,99};
       double[] bmi=new double[h.length];
       int i,n=0;
       double max=0;
       
       for(i=0;i<h.length;i++)
       {
    	   bmi[i]=w[i]/Math.pow(h[i]/100.0,2);
    	   if(bmi[i]>max)
    	   {
    		   max=bmi[i];
    		   n=i;
    	   }
    	   System.out.println(h[i]+" "+w[i]+" "+bmi[i]);
       }
       System.out.println("²Ä"+(n+1)+"¦ì³Ì­D,BMI="+bmi[n]);
       
       
	}

}
