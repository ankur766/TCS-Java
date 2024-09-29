package com.tcs.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckVolConst {
	public static void countalpha(StringBuilder sb)
	{
		HashMap<String , Integer>map=new HashMap<String, Integer>();
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'||sb.charAt(i)=='A'||sb.charAt(i)=='E'||sb.charAt(i)=='I'||sb.charAt(i)=='O'||sb.charAt(i)=='U')
			{
				if(map.containsKey("vowel"))
				{
					map.put("vowel", map.get("vowel")+1);
				}
				else {
					map.put("vowel", 1);
				}
			}
			else if(sb.charAt(i)==' '){
				if(map.containsKey("whiteSpace"))
				{
					map.put("whiteSpace", map.get("whiteSpace")+1);
				}
				else {
					map.put("whiteSpace", 1);
				}
				
				
			}
			else {
				if(map.containsKey("const"))
				{
					map.put("const", map.get("const")+1);
				}
				else {
					map.put("const", 1);
				}
				
			}
		}
		
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb =new StringBuilder();
		String input=sc.nextLine();
		
		sb.append(input);
		countalpha(sb);

	}

}
