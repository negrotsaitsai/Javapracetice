import java.util.Scanner;

public class twoArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]  pay= {{21000,23000,26000},{28000,35000,40000},{38000,45000,58000}};
		int[][]  add= {{1200,1500,1600},{3500,4000,4500},{8000,10000,12000}};
		Scanner  sc=new Scanner(System.in);
		
       System.out.println("1.員工");
       System.out.println("2.主管");
       System.out.println("3.經理");
       System.out.print("請輸入職位:");
       int x=sc.nextInt();
       System.out.println("1.職等一");
       System.out.println("2.職等二");
       System.out.println("3.職等三");
       System.out.print("請輸入等級:");
       int y=sc.nextInt();
       int salary;
       salary=pay[x-1][y-1]+y*add[x-1][y-1];
       System.out.println("底薪:"+pay[x-1][y-1]);
       System.out.println("加給:"+add[x-1][y-1]);
       System.out.println("薪水:"+salary);
	}

}
