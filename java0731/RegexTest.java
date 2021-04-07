/**
 * @(#)RegexTest.java
 *
 *
 * @author 
 * @version 1.00 2008/4/29
 */

import java.util.regex.*;
public class RegexTest {

    public RegexTest() {
    }
    public static void main (String[] args) {
    	Pattern  p=Pattern.compile("ab");
    	Matcher m=p.matcher("abaaaba");
    	boolean b=false;
    	while(b=m.find())
    		System.out.print(m.start()+" ");
    }
    
}