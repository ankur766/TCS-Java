package com.tcs.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveAllVowelfromString {
	public static void removeVowel(StringBuilder sb)
	{
		
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'||sb.charAt(i)=='A'||sb.charAt(i)=='E'||sb.charAt(i)=='I'||sb.charAt(i)=='O'||sb.charAt(i)=='U')
			{
				
				sb.deleteCharAt(i);
			}
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				StringBuilder sb =new StringBuilder();
				String input=sc.nextLine();
				
				sb.append(input);
				removeVowel(sb);
				System.out.println(sb);

	}

}
