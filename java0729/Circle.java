package gao.myclass;

public class Circle {
    //�����ܼ�
	public int r;  //�ŧi
	
	//�غc�l
	public Circle()   //�w�]�غc�l
	{
		r=0;
	}
	public Circle(int r)
	{
		//�C�����O����this,��ܦۤv
		this.r=r;
	}
	
	//��k
	public void setr(int x)  //�]�w�b�|
	{
		r=x;  
	}
	public double area()
	{
		return Math.PI*Math.pow(r, 2);
	}
	public double length()
	{
		return 2*Math.PI*r;
	}
	public double area(int x)
	{
		return Math.PI*Math.pow(x, 2);
	}
	
	
	
}
