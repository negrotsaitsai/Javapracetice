/*
����(Honda)�X�U����ڨ��AHonda Civic�MHonda Accord 
�o��ڨ������L�j�p�A�٨��t�ΡA�w�����n���˸m���@�ˡA�u���������Ұʤ覡���@�� 
�o�ɥi�H�w�q�@�ө�H���OHondaCar �A�ñN�����Ұʪ���k�w�q��abstact�A�j���~�Ӫ����O��@�o�Ӥ�k�C 

  */
 abstract class HondaCar
{
    protected int tireSize = 12;
    
    protected abstract void engineStart();
    protected void stopCar()
    {
        // break method
    }
    
    protected void popAirBag()
    {
        //pop Air Bag
    }
}
/*
abstract class Civic extends HondaCar
{
 
    protected abstract void engineStart();
    
 
}*/

class CV extends HondaCar
{
	protected void engineStart(){
		
		}
}

class Accord extends HondaCar
{
 
    protected void engineStart()
    {
        // Accord engine start method
 
    }
 
}



public class abstractTest {

    public abstractTest() {
    }
    
    
}