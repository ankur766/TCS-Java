package com.tcs.String;

import java.util.Scanner;

public class CheckPalindrome {
	public static Boolean checkPalindrome(StringBuilder sb)
	{
		int start=0;
		int end=sb.length()-1;
		while(start<end)
		{
			if(sb.charAt(start)!=sb.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb =new StringBuilder();
		String input=sc.next();
		sb.append(input);
		if(checkPalindrome(sb))
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	
		
		

	}

}
