class MyDate
{
	private int year,month,day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public MyDate() {
		super();
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		boolean result = false;
 		if ( (o != null) && (o instanceof MyDate) ) {
 			MyDate d = (MyDate) o;
 			if ( (day == d.day) && (month == d.month)
					&& (year == d.year) ) {
 					result = true;
			}
 		}
 		return result;

	}
	
	
	
	
}



public class MyDateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyDate  x=new MyDate(2020,7,31);
        System.out.println(x.equals(new MyDate(2020,7,31)));
	}

}
