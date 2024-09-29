package com.tcs.String;

import java.util.Scanner;

public class ReverseString {
	public static void  reverseString(StringBuilder sb)
	{
		int start=0;
		int end =sb.length()-1;
		while(start<end)
		{
			char font=sb.charAt(start);
			char last=sb.charAt(end);
			sb.setCharAt(start, last);
			sb.setCharAt(end, font);
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb =new StringBuilder();
		String input=sc.nextLine();
		
		sb.append(input);
		reverseString(sb);
		System.out.println(sb);


	}

}
