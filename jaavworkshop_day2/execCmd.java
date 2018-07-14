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
import java.io.*;
public class execCmd {
 public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
 
    try {
      rs.exec("chrome");
      rs.exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
      
    }
    catch (IOException e) {
      System.out.println(e);
    }   
  }
    
}
