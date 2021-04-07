
public class twoLoop5_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        i=1;
        while(i<=9)
        {
        	j=1;
        	while(j<=9)
        	{
        	    System.out.print(i+"*"+j+"="+i*j+" ");        		
        		j++;
        	}
        	System.out.println();
        	i++;
        }
	}

}
