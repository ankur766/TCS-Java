package com.tcs.String;

import java.util.Scanner;

public class CapitalizeFirstAndLastCharacterOfEachWord {
	public static void FrstandLastchar(StringBuilder sb) {
//		char firstchar=sb.charAt(0);
//		char lastchar=sb.charAt(sb.length()-1);	
//		sb.setCharAt(0,Character.toUpperCase(firstchar) );
//		sb.setCharAt(sb.length()-1,Character.toUpperCase(lastchar));
		
		
		int firstchar=sb.charAt(0)+'a';
		int lastchar=sb.charAt(sb.length()-1)+'a';	
 	    sb.setCharAt(0,(char)firstchar);
		sb.setCharAt(sb.length()-1,(char)lastchar);
		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb =new StringBuilder();
		String input=sc.nextLine();
		
		sb.append(input);
		FrstandLastchar(sb);
		System.out.println("-----------------------------------");
		System.out.println(sb);


	}

}
