package java0722;
import java.util.Scanner;
public class bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner  sc=new Scanner(System.in);
        int h,w;
        double bmi;
        System.out.print("身高:");
        h=sc.nextInt();
        System.out.print("體重:");
        w=sc.nextInt();
        //  bmi=w/(h*h);
        double x=h/100.0;
        bmi=w/Math.pow(x, 2);
        System.out.println("BMI="+bmi);
        
        if(bmi<18.5)
          System.out.println("太輕");
        else if(bmi>=18.5 && bmi<24)
          System.out.println("正常");
        else if(bmi>=24 && bmi<27)
          System.out.println("過重");
        else if(bmi>=27 && bmi<30)
          System.out.println("輕度肥胖");
        else 
          System.out.println("肥胖");
        
	}

}
