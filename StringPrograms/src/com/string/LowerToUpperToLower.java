package com.string;

import java.util.Scanner;

public class LowerToUpperToLower {
	
	public static void LowerToUpperAndViceVersa()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		String x = "";
		for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if (Character.isUpperCase(ch))
			x += Character.toLowerCase(ch);
		else
			x += Character.toUpperCase(ch);
		}
		sc.close();
		System.out.println(x);
	}
	
	public static void main(String[] args)
	{
		LowerToUpperAndViceVersa();
	}
}
