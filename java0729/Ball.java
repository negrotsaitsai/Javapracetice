package gao.myclass;

public class Ball extends Circle{
	//�����ܼ�
	
	//�غc�l
	public Ball()
	{
		
	}
	public Ball(int x)
	{
		super(x); //�I�s�����غc�l
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