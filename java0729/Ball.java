package gao.myclass;

public class Ball extends Circle{
	//成員變數
	
	//建構子
	public Ball()
	{
		
	}
	public Ball(int x)
	{
		super(x); //呼叫父類建構子
	}
    public double BallArea()
    {
    	return 4*Math.PI*r*r;
    }
    public double BallVolume()
    {
    	return 4.0/3*Math.pow(r,3);
    }
}