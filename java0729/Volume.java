package gao.myclass;

public class Volume extends Triangle{
    private int high;
    public Volume()
    {
    	
    }
    public Volume(int a,int b,int c)
    {
    	super(a,b);
    	high=c;
    }
    public double plie()
    {
    	return Area()*high;
    }
    public double taper()
    {
    	return Area()*high/3;
    }
}
