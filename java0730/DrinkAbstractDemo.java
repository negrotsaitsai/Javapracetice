
abstract  class ���Q�P�[����
{
          public  void  �}�B�B�@��(){
                 System.out.println("���ũ@��+�p���B��O");
          }
          public void �[�����()
          { 
                System.out.println("�����s���ź��");
          }
          public  void  �i�Q����()
          {
                System.out.println("�S�s�i�Q����+����");
          }
          abstract public void  �U�a�S�ⶼ��();
          abstract public void  �i�Q���~();
}
class �y������ extends ���Q�P�[����
{
	public void  �U�a�S�ⶼ��()
	{
		System.out.println("���+�i�֦h");
	}
	public void  �i�Q���~()
	{
		System.out.println("�]�߯���+����");
	}	
}
class �s�ˤ��� extends ���Q�P�[����
{
	public void  �U�a�S�ⶼ��()
	{
		System.out.println("���+�}�J�c");
	}
	public void  �i�Q���~()
	{
		System.out.println("�j����+����");
	}	
}



public class DrinkAbstractDemo {

    public DrinkAbstractDemo() {
    }
    
    public static void main(String[] args)
    {
    	�y������   a=new �y������();
    	a.�}�B�B�@��();
    	a.�i�Q���~();
    	
    }
    
}