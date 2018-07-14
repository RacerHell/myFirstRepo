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
public class stringReverse {
    public String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
 
		// split to words by space
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}
    
    public static void main(String[] args)
    {
        String s="sky is blue";
        stringReverse obj=new stringReverse();
        System.out.println(obj.reverseWords(s));
    }
    
}
