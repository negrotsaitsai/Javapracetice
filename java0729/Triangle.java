package gao.myclass;

public class Triangle {
    private int length,height;
    
    public Triangle()
    {
    	
    }
    public Triangle(int a,int b)
    {
    	length=a;
    	height=b;
    }
    public double Area()
    {
    	return length*height/2.0;
    }
}
