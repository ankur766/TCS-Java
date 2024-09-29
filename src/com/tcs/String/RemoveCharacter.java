package com.tcs.String;

import java.util.Scanner;

public class RemoveCharacter {
	public static void removeCharacter(StringBuilder sb)
	{
		
		for(int i=0;i<sb.length();i++)
		{
			if(!(sb.charAt(i)>='a'&&sb.charAt(i)<='z')&&!(sb.charAt(i)>='A'&&sb.charAt(i)<='Z'))
			{
				
				sb.deleteCharAt(i);
			i--;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				StringBuilder sb =new StringBuilder();
				String input=sc.nextLine();
				
				sb.append(input);
				removeCharacter(sb);
				System.out.println(sb);

	}

}
