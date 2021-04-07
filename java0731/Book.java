package gao.mybook;

public class Book {
	 private String num,name;
	    private int price,qty;
		public Book(String num, String name, int price, int qty) {
			super();
			this.num = num;
			this.name = name;
			this.price = price;
			this.qty = qty;
		}
		public Book() {
			super();
		}
		public String getNum() {
			return num;
		}
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
		public int getQty() {
			return qty;
		}
	    public double tal()
	    {
	    	return price*qty;
}
}