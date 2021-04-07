
public class Array4_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]  r= {5,10,18,26,50,72};
        double[]  area=new double[r.length];
        int i;
        for(i=0;i<r.length;i++)
        {
        	area[i]=Math.PI*Math.pow(r[i],2);
        	System.out.println(r[i]+"  "+area[i]);        	
        }
	}

}
