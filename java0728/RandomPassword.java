
public class RandomPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String tmp="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
      char[]  pwd=new char[10];
      int i;
      for(i=0;i<10;i++)
      {
    	  pwd[i]=tmp.charAt(  (int)(Math.random()*tmp.length()+0));    	  
      }
      System.out.println(pwd);
      System.out.println(new String(pwd));
      
	}

}
