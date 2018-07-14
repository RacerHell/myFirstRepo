/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.io.*;
import java.util.*;
public class toUpper {
     public static void main(String[] args) throws Exception
    {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Enter the string");
        String name= reader.nextLine();
        /*System.out.println("Enter the integer");
        int n= reader.nextInt();
        System.out.println(name);
        System.out.println(n);
        */
        char[] rev = name.toCharArray();
        for (int i = name.length()-1;i>=0;i--)
        {
            System.out.print(rev[i]);
        }
        System.out.println();
        
    }
    
}
