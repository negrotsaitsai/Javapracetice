import java.util.Scanner;

class Height extends Exception
{
	double h;

	public Height(double h) {
		super();
		this.h = h;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "����:"+h+"�W�X50~250����";
	}
	
}
class Weight  extends Exception
{
	double w;

	public Weight(double w) {
		super();
		this.w = w;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�魫:"+w+"�W�X10~300����";
	}
	
}




public class UserExceptionTest2_BMI {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		boolean flag=false;
		System.out.print("����:");
		double h=sc.nextDouble();		
		System.out.print("�魫:");
		double w=sc.nextDouble();
		try {
			if(h<50 || h>250)
				throw new Height(h);
		}catch(Height e)
		{
			System.out.println(e);
			flag=true;
		}
		
		
		try {
			
			if(w<10 || w>300)
				throw new Weight(w);
		}catch(Weight e)
		{
			System.out.println(e);
			flag=true;
		}
		
		double bmi;
		if(flag==false)
		{
		  bmi=w/Math.pow(h/100, 2);
		  System.out.println("BMI="+bmi);
		}
		
		
	}
}
