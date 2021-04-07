interface Pixel
{
	void setPixel(int n);
	int getPixel();
}

class Notebook{
	private int px;

	public Notebook() {
		super();
	}
	
	Pixel  a=new Pixel()
	{

		@Override
		public void setPixel(int n) {
			// TODO Auto-generated method stub
			px=n;
		}

		@Override
		public int getPixel() {
			// TODO Auto-generated method stub
			return px;
		}
		
    };
	
	
	
}



public class AnonymousInner_Pixel {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Notebook  book=new Notebook();
       book.a.setPixel(300000);
       System.out.println(book.a.getPixel());
	}

}
