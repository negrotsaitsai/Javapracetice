package java0722;
import java.util.Scanner;
public class bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner  sc=new Scanner(System.in);
        int h,w;
        double bmi;
        System.out.print("����:");
        h=sc.nextInt();
        System.out.print("�魫:");
        w=sc.nextInt();
        //  bmi=w/(h*h);
        double x=h/100.0;
        bmi=w/Math.pow(x, 2);
        System.out.println("BMI="+bmi);
        
        if(bmi<18.5)
          System.out.println("�ӻ�");
        else if(bmi>=18.5 && bmi<24)
          System.out.println("���`");
        else if(bmi>=24 && bmi<27)
          System.out.println("�L��");
        else if(bmi>=27 && bmi<30)
          System.out.println("���תέD");
        else 
          System.out.println("�έD");
        
	}

}
