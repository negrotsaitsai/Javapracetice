
class Student{
    private String num,name;

	public Student(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public String getName() {
		return name;
	}
    
	class Body{
		private double h,w;

		public Body(double h, double w) {
			super();
			this.h = h;
			this.w = w;
		}

		public double getH() {
			return h;
		}

		public double getW() {
			return w;
		}
		
		public double BMI()
		{
			double x=h/100;
			return w/Math.pow(x, 2);
		}
		
	}
	
	
}

public class InnerClass_Student {
	 public static void main (String[] args) {
		 Student  stu=new Student("1090625","peter");
		 Student.Body  body=stu.new Body(175,86);
		 System.out.println(stu.getName());
		 System.out.println(body.getH());
		 System.out.println(body.getW());
		 System.out.println(body.BMI());
		 
	 }
}
