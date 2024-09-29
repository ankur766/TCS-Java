package com.tcs.String;

import java.util.Scanner;

public class RemovewhiteSpace {
	public static void removeWhiteSpace(StringBuilder sb)
	{
		
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)==' ')
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
				removeWhiteSpace(sb);
				System.out.println(sb);

	}

}
