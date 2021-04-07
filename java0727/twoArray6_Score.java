
public class twoArray6_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  names= {"bill","peter","jackie","mary"};
        double[][]  s= {{92,86,75,0,0},
    		   {51,72,63,0,0},
    		   {76,81,65,0,0},
    		   {68,85,70,0,0}   };
        int i,j;
        for(i=0;i<s.length;i++)
        {
        	System.out.print(names[i]+" ");
        	for(j=0;j<3;j++)
        	{
        		s[i][3]+=s[i][j];
        		System.out.print(s[i][j]+" ");
        	}
        	s[i][4]=s[i][3]/3;
        	System.out.println(s[i][3]+" "+s[i][4]);
        }
        
        
       
       
       
	}

}
