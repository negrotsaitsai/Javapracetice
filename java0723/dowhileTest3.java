import java.util.Scanner;

public class dowhileTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner  sc=new Scanner(System.in);
        do {
        	System.out.print("input n(1~6):");
        	n=sc.nextInt();
        	if(n<1 || n>6)
        	{
        		System.out.println("��J���~,����1~6");        		
        	}
        } while( n<1 || n>6   );
        System.out.println("�A��J���O:"+n);	
      
	}

}
