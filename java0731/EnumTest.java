/**
 * @(#)EnumTest.java
 *
 *
 * @author 
 * @version 1.00 2009/9/18
 */


public class EnumTest {
	//列舉宣告在類別內
    public enum  week{ Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday  };
    public EnumTest() {
    }
    public static void main (String[] args) {
           System.out.println(week.Monday);	
           System.out.println("------------------------");
           week[]  w=week.values();
           for (int i=0;i<w.length;i++)
           	 System.out.println(w[i]+",");	
           	
     }
    
}