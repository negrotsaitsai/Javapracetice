
interface CarSafe     //�w������
{
	public void popAirBag();   //�w�����n
	public void BabyChar();    //�ൣ�w������
}

interface CarETC   //ETC����
{
    public void ETC();
    
}

class Honda implements CarETC
{
	public void ETC(){
		System.out.println("Honda�w��ETC");
	}
}

class Nissan  implements CarETC
{
	public void ETC(){
		System.out.println("Nissan�w��ETC");
	}
}

class TOYOTA  implements CarETC,CarSafe
{
	
	public void popAirBag(){
		System.out.println("TOYOTA �w�����n");
		}   //�w�����n
	public void BabyChar(){}    //�ൣ�w������
	public void ETC(){
			System.out.println("TOYOTA�w��ETC");
	}
}


public class interfaceTest {

    public interfaceTest() {
    }
    public static void main (String[] args) {
    	Honda  h=new  Honda();
    	h.ETC();
    	Nissan  n=new Nissan();
    	n.ETC();
    	TOYOTA  t=new TOYOTA();
    	t.ETC();
    	t.popAirBag();
    	
    }
    
}