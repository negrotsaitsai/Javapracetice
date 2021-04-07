import java.util.Scanner;

public class twoArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner  sc=new Scanner(System.in);
       int[][]  p= {{3,7},{-2,5},{9,-1},{6,15},{11,20}};
       int x,y,r;
       System.out.print("圓心x,y:");
       x=sc.nextInt();
       y=sc.nextInt();
       System.out.print("半徑:");
       r=sc.nextInt();
       int i;
       double dist;
       for(i=0;i<p.length;i++)
       {
    	   dist=Math.sqrt(Math.pow(x-p[i][0],2)+Math.pow( p[i][1],2));
    	   if(dist>r)
    		   System.out.println("("+p[i][0]+","+p[i][1]+")在圓外,距離:"+dist);
    	   else if(dist<r)
    		   System.out.println("("+p[i][0]+","+p[i][1]+")在圓內,距離:"+dist);
    	   else
    		   System.out.println("("+p[i][0]+","+p[i][1]+")在圓上,距離:"+dist);
       }
       
	}

}
