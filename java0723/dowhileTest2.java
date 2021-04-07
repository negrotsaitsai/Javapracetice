import java.util.Scanner;

public class dowhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c;
        char ans;
        Scanner  sc=new Scanner(System.in);
        do {
        	System.out.print("a=");
        	a=sc.nextInt();
        	System.out.print("b=");
        	b=sc.nextInt();
        	c=a+b;
        	System.out.println(a+"+"+b+"="+c);
        	System.out.print("¬O§_Ä~Äò(y/n):");
        	ans=sc.next().charAt(0);
        	
        }while( ans=='y' ||  ans=='Y'  );
        System.out.println("end");
	}

}
