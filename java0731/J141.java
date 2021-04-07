/**
 * @(#)J141.java
 *
 *
 * @author 
 * @version 1.00 2008/4/29
 */


public class J141 {

    public J141() {
    }
    public static void main (String[] args) {
    	String test="a1b2c3";
    	String[]  tokens=test.split("\\d");
    	for(String  s:tokens)
    		System.out.print(s+" ");
    }
    
}