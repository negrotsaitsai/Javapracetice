package gao.myclass;

public class Body {
   //�����ܼ�
   private double h,w;//�����ܼƷ|����l��
   private boolean sex;
   //�غc�l
   public Body()
   {   
   }
   public Body(double h,double w,boolean sex)
   {
	 this.h=h;
     this.w=w;
     this.sex=sex;
   }
   
   //��k
   public double bmi()
   {
	 double x=h/100;
	 return w/Math.pow(x,2);
   }
   public double StdWeight()
   {
	 if(sex==true)
		 return (h-80)*0.7;
	 else
		 return (h-70)*0.6;
   }
}