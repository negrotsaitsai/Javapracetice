
public class Add {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,sum=0;
     try {  
       for(i=0;i<args.length;i++)
       {
    	   sum+= Integer.parseInt( args[i]);
       }
       
     }catch(NumberFormatException  e)
     {
    	 System.out.println(e);
     }
     System.out.println("sum="+sum);
	}   
}
