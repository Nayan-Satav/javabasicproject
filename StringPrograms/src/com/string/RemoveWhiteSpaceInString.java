package com.string;

import java.util.Scanner;

public class RemoveWhiteSpaceInString {
	
	public static void RemoveWhiteSpace()
	{
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the string");

		    // take the input
		    String input = sc.nextLine();
		    System.out.println("Original String: " + input);

		    // remove white spaces
		    input = input.replaceAll("\\s", "");
		    System.out.println("Final String: " + input);
		    sc.close();
	}

	  public static void main(String[] args) {

		  RemoveWhiteSpace();
	   
	  }
	}

