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

public class Strings {
    public static void main(String[] arg) 
    {
    String s="HelloWorld";
    System.out.println("Substring "+s.substring(2,5));
    
    String s1="UTL";
    String s2="Technologies";
    System.out.println("Substring "+s1.concat(s2));
    
    //Converting Case
    String word1="GreeksBytes";
    System.out.println("Change to lower case: "+ word1.toLowerCase());
    
    //Trimming the word
    String word4= "Learn Share Learn";
    System.out.println("Trim the word "+word4.trim());
    
        String word5="UTL Technologies Bangalore";
        
}
}
