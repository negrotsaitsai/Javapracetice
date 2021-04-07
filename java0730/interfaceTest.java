
interface CarSafe     //安全介面
{
	public void popAirBag();   //安全氣囊
	public void BabyChar();    //兒童安全坐椅
}

interface CarETC   //ETC介面
{
    public void ETC();
    
}

class Honda implements CarETC
{
	public void ETC(){
		System.out.println("Honda安裝ETC");
	}
}

class Nissan  implements CarETC
{
	public void ETC(){
		System.out.println("Nissan安裝ETC");
	}
}

class TOYOTA  implements CarETC,CarSafe
{
	
	public void popAirBag(){
		System.out.println("TOYOTA 安全氣囊");
		}   //安全氣囊
	public void BabyChar(){}    //兒童安全坐椅
	public void ETC(){
			System.out.println("TOYOTA安裝ETC");
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