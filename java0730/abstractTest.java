/*
本田(Honda)旗下有兩款車，Honda Civic和Honda Accord 
這兩款車的輪胎大小，煞車系統，安全氣囊等裝置都一樣，只有引擎的啟動方式不一樣 
這時可以定義一個抽象類別HondaCar ，並將引擎啟動的方法定義為abstact，強迫繼承的類別實作這個方法。 

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