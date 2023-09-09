package com.string;

import java.util.Scanner;

public class DivideStringInEqualPart {

	static void divide() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter String");
		 String str = sc.nextLine();
		 System.out.println("Enter Size You want to divid");
		 int n=sc.nextInt();
		 if (str.length() % n != 0) {
            System.out.println("Invalid Input: String size");
            System.out.println(" is not divisible by n");
           
        }
 
        int parts = str.length() / n;
        int start = 0;
        int t = parts;
        while (start < str.length()) {
            String temp = new String(str);
 
            System.out.print(temp.substring(start, parts) + "\n");
            start = parts;
            parts += t;
            // if(start < str.length()) System.out.println(); to ignore
            // final new line
        }
        sc.close();
    }
 
  
    public static void main(String[] args) {
        
        divide();
    } 
	
}
