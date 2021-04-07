
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] money= {25000,36000,75000,12000,63000};
       double[]  rate= {0.023,0.015,0.026,0.032,0.027};
       double[]  sum=new double[money.length];
       int i;
       for(i=0;i<money.length;i++)
       {
    	   sum[i]=money[i]*(1+rate[i]);
    	   System.out.println(money[i]+"  "+rate[i]*100+"%  "+sum[i]);
       }
	}

}
