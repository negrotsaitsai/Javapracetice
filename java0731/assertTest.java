/**
 * @(#)assertTest.java
 *
 *
 * @author 
 * @version 1.00 2008/4/26
 */

import java.util.*;
public class assertTest {

    public assertTest() {
    }
    public static void main(String[]  args){
    	Scanner  k=new  Scanner(System.in);
    	System.out.print("input your grade:");
    	String G = k.next();
    	char myGrade=G.charAt(0);
        switch (myGrade) {
 		case 'A': 
 			System.out.println("A");
 			break;
 		case 'B': 
 			 System.out.println("B");
			 break;
 		case 'C': 
 			 System.out.println("C");
 			 break;
 		default: assert   false : "impossible grade: " + myGrade;
 		     System.out.println("input error");
        }

    }
    
}