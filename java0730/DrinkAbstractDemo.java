
abstract  class 五十嵐加盟店
{
          public  void  漂浮冰咖啡(){
                 System.out.println("頂級咖啡+小美冰其淋");
          }
          public void 茉莉綠茶()
          { 
                System.out.println("阿里山頂級綠茶");
          }
          public  void  波霸奶茶()
          {
                System.out.println("特製波霸粉圓+奶茶");
          }
          abstract public void  各地特色飲料();
          abstract public void  波霸飲品();
}
class 宜蘭分店 extends 五十嵐加盟店
{
	public void  各地特色飲料()
	{
		System.out.println("綠茶+養樂多");
	}
	public void  波霸飲品()
	{
		System.out.println("包心粉圓+奶茶");
	}	
}
class 新竹分店 extends 五十嵐加盟店
{
	public void  各地特色飲料()
	{
		System.out.println("綠茶+糖胡盧");
	}
	public void  波霸飲品()
	{
		System.out.println("大薏仁+奶茶");
	}	
}



public class DrinkAbstractDemo {

    public DrinkAbstractDemo() {
    }
    
    public static void main(String[] args)
    {
    	宜蘭分店   a=new 宜蘭分店();
    	a.漂浮冰咖啡();
    	a.波霸飲品();
    	
    }
    
}