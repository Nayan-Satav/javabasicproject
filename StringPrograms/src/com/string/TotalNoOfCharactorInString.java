package com.string;

import java.util.Scanner;

public class TotalNoOfCharactorInString {

	public static int CountStringCharators(){
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		/*
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				count++;
		}
		*/
		int i=0;
		while(i<s.length())
		{
			if(s.charAt(i) !=' ')
			{
			count++;
			}
			i++;
		}
		System.out.println(count);
		sc.close();
		return count;
		
	}

	public static void main(String[] args) {

		int a= CountStringCharators();
		System.out.println("Number of Charators in String :  " +a);
	}

}
