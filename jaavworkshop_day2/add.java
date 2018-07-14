/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaavworkshop_day2;

/**
 *
 * @author User
 */
import java.util.*;
public class add {
    public static void main(String[] arg) 
	 {
	   int x, y ;
	   Scanner in = new Scanner(System.in);	
	   System.out.print("Input first number: ");
	   x = in.nextInt(); 
	   System.out.print("Input second number: ");
	   y = in.nextInt(); 
      while(y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: "+x); 
		System.out.print("\n");     	
	}	
    
}
