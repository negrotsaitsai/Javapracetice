package gao.mybook;

public class Discount extends Book{
	 private int car;

	public Discount() {
	super();
	// TODO Auto-generated constructor stub
	}

	public Discount(String num, String name, int price, int qty,int c) {
	super(num, name, price, qty);
	car=c;		
	}

	public int getCar() {
	return car;
	}

	@Override
	public double tal() {
	// TODO Auto-generated method stub
	double t=super.tal();
	if(t>=50000)
	return t*0.7+car;
	else if(t>=30000)
	return t*0.85+car;
	else if(t>=20000)
	return t*0.9+car;
	else
	return t+car;
	}
}
