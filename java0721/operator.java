package java0721;

public class operator {

	public static void main(String[] args) {
		double high=170;
		high/=100;
		System.out.println("h="+high);
		
		int b=39;
		b%=7;
		System.out.println("b="+b);
		
		int i=8;
		--i;
		System.out.println("i="+i);
		
		int x=23;
		int y;
		y=3+x++;
		System.out.println("x="+x+" y="+y);
		
		int k=56;
		System.out.println("k="+k--);
		
		System.out.println("k="+k);
	}
}