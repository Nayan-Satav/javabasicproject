package com.string;

import java.util.Scanner;

public class TotalNoOfPunctuationCharactorsInString {

	public static int punctuationCharactors() {
		Scanner sc=new Scanner(System.in);
		int countPuncMarks = 0;  
		System.out.println("Enter String");
        String str =sc.nextLine(); 
        
        for (int i = 0; i < str.length(); i++) {  
                //Checks whether given character is punctuation mark  
            if(str.charAt(i) == '!' 
            		|| str.charAt(i) == ',' || str.charAt(i) == ';' 
            		|| str.charAt(i) == '.' || str.charAt(i) == '?' 
            		|| str.charAt(i) == '-' || str.charAt(i) == '\'' 
            		|| str.charAt(i) == '\"' 
                    || str.charAt(i) == ':') 
            {  
                countPuncMarks++;  
            }  
        }  
        System.out.println("Total number of punctuation characters exists in string: " +countPuncMarks);
        sc.close();
		return countPuncMarks;
	}
	public static void main (String [] args) {  
		punctuationCharactors();  
    } 
}
