package com.string;

import java.util.Scanner;

public class PermutatioNumber {

	 // Function to print all the permutations of str
    static void printPermutn(String str, String ans) {

//    	Scanner sc=new Scanner(System.in);
//    	 str = sc.nextLine();
    	 // Function to print all the permutations of str
    	    

    	        // If string is empty
    	        if (str.length() == 0) {
    	            System.out.print(ans + " ");
    	            return;
    	        }
    	        for (int i = 0; i < str.length(); i++) {

    	            // ith character of str
    	            char ch = str.charAt(i);

    	            // Rest of the string after excluding the ith character
    	            String r = str.substring(0, i) + str.substring(i + 1);

    	            // Recurvise call
    	            printPermutn(r, ans + ch);
    	        }
    	    }

    	    // Driver code
    	    public
    	    static void main(String[] args) {
    	    	Scanner sc= new Scanner(System.in);
    	    	System.out.println("Enter String");
    	        String s = sc.next();
    	        printPermutn(s, "");
    	        sc.close();
    	    }
	
}
