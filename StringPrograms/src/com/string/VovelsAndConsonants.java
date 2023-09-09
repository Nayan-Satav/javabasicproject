package com.string;

import java.util.Scanner;

public class VovelsAndConsonants {
	public static void CountVowelConsonant()
	{
		Scanner sc=new Scanner(System.in);
	            
		        //Counter variable to store the count of vowels and consonant    
		        int vCount = 0, cCount = 0;    
		            
		        //Declare a string    
		        System.out.println("Enter a String");
		    	String str = sc.nextLine();     
		            
		        //Converting entire string to lower case to reduce the comparisons    
		        str = str.toLowerCase();    
		            
		        for(int i = 0; i < str.length(); i++) {    
		            //Checks whether a character is a vowel    
		            if(str.charAt(i) == 'a' 
		            		|| str.charAt(i) == 'e' 
		            		|| str.charAt(i) == 'i' 
		            		|| str.charAt(i) == 'o' 
		            		|| str.charAt(i) == 'u') 
		            {    
		                //Increments the vowel counter    
		                vCount++;    
		            }    
		            //Checks whether a character is a consonant    
		            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
		            {      
		                //Increments the consonant counter    
		                cCount++;    
		            }    
		            
		        }    
		        System.out.println("Number of vowels: " + vCount);    
		        System.out.println("Number of consonants: " + cCount);
		        sc.close();
	}

	
	    public static void main(String[] args) {  
	    	
	            CountVowelConsonant();
	    } 
	
}
