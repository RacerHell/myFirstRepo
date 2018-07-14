/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaavworkshop_day2;
import java.io.*;
/**
 *
 * @author User
 */
public class JaavWorkshop_Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // One dimentional array
       int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
       
       for (int i = 0; i < arr.length; i++)
       {
  System.out.println("Element at index " + i + 
                                " : "+ arr[i]);
    }
    
    //Two dimensional Array
    int[][]  arr1= { {2,7,9},{3,6,1},{7,4,2} };
        for(int j=0; j< arr1.length; j++)
        {
            for (int k=0; k < 3 ; k++)
            {
                System.out.print(arr1[j][k] + " "); 
            }
                System.out.println();
        }
       
    }
}
