import java.util.Scanner;

public class twoArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]  pay= {{21000,23000,26000},{28000,35000,40000},{38000,45000,58000}};
		int[][]  add= {{1200,1500,1600},{3500,4000,4500},{8000,10000,12000}};
		Scanner  sc=new Scanner(System.in);
		
       System.out.println("1.���u");
       System.out.println("2.�D��");
       System.out.println("3.�g�z");
       System.out.print("�п�J¾��:");
       int x=sc.nextInt();
       System.out.println("1.¾���@");
       System.out.println("2.¾���G");
       System.out.println("3.¾���T");
       System.out.print("�п�J����:");
       int y=sc.nextInt();
       int salary;
       salary=pay[x-1][y-1]+y*add[x-1][y-1];
       System.out.println("���~:"+pay[x-1][y-1]);
       System.out.println("�[��:"+add[x-1][y-1]);
       System.out.println("�~��:"+salary);
	}

}
