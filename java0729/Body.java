package gao.myclass;

public class Body {
   //成員變數
   private double h,w;//成員變數會有初始值
   private boolean sex;
   //建構子
   public Body()
   {   
   }
   public Body(double h,double w,boolean sex)
   {
	 this.h=h;
     this.w=w;
     this.sex=sex;
   }
   
   //方法
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