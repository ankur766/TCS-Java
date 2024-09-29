package com.tcs.String;

import java.util.Scanner;

public class FindASCIIvalue {
	public static void convertAsciivalue(StringBuilder sb)
	{
		for(int i=0;i<sb.length();i++)
		{
			System.out.println((int) sb.charAt(i)-'0'+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String input = sc.nextLine();
		sb.append(input);
		convertAsciivalue(sb);

	}

}
