package com.string;

import java.util.Scanner;

public class SubsetOfString {

	public static void subsets(){
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("The string is defined as: ");
		 String str = sc.nextLine();
	      int string_length = str.length();
	      int temp = 0;
	      
	      String string_array[] = new String[string_length*(string_length+1)/2];
	      
	      for(int i = 0; i < string_length; i++) {
	         for(int j = i; j < string_length; j++) {
	            string_array[temp] = str.substring(i, j+1);
	            temp++;
	         }
	      }
	      System.out.println("The subsets of the string are: ");
	      for(int i = 0; i < string_array.length; i++) {
	         System.out.println(string_array[i]);
	      }
	      sc.close();
	   }
	   public static void main(String[] args) {
	      
	      subsets();
	   }	
}
