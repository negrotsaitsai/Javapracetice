
interface GPS
{
	void �ɯ�˸m();
	void mp3����();
}
class �}�� implements GPS
{
	public void  �ɯ�˸m()
	{
		System.out.println("���Y�p�Ѿɯ�");		
	}
	public void mp3����()
	{
		
	}
}
class ���� implements GPS
{
	public void  �ɯ�˸m()
	{
	   System.out.println("���Y�p�Ѿɯ�+�����O�_��ĵ��");			
	}
	public void mp3����()
	{
		
	}
}
class �T�� implements GPS
{
	public void  �ɯ�˸m()
	{
		 System.out.println("���Y�p��,���t�����ɯ�+�����O�_��ĵ��+���t�ӹ�");			
	}
	public void mp3����()
	{
		
	}
}

public class GPSInterfaceDemo {

    public GPSInterfaceDemo() {
    }
    public static void main (String[] args) {
         �}��  b=new �}��();	
    }
    
}