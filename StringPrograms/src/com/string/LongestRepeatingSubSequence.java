package com.string;

// Java program to find the longest

import java.util.*;

class LongestRepeatingSubSequence
{
	// Function to find the longest repeating subsequence
	static int findLongestRepeatingSubSeq()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		int n = str.length();

		// Create and initialize DP table
		int[][] dp = new int[n+1][n+1];

		// Fill dp table (similar to LCS loops)
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				// If characters match and indexes are not same
				if (str.charAt(i-1) == str.charAt(j-1) && i!=j)
					dp[i][j] = 1 + dp[i-1][j-1];		
					
				// If characters do not match
				else
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
			}
		}
		sc.close();
		return dp[n][n];
	}
	
	
	public static void main (String[] args)
	{
		
		System.out.println("The length of the largest subsequence that"
			+" repeats itself is : "+findLongestRepeatingSubSeq());
	}
}

