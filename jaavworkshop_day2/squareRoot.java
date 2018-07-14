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
 import java.util.Scanner;
 
public class squareRoot {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		double number, squareRoot,temp;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextDouble();		
		//squareRoot = Math.sqrt(number);
		squareRoot = number / 2;
                 do 
                    {
                        temp = squareRoot;
                        squareRoot = (temp + (number / temp)) / 2;
                    } while ((temp - squareRoot) != 0);
		System.out.println("\n The Square of a Given Number  " + number + "  =  " + squareRoot);
	}
}
    
