package com.tcs.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindRepatingElement {
	
	public static void repatingArray(ArrayList<Integer>list)
	{
		HashMap<Integer,Integer>map= new HashMap<Integer, Integer>();
		for(int value : list)
		{
			if(map.containsKey(value))
			{
				map.put(value, map.get(value)+1);
			}
			else {
				map.put(value,1);
			}
			
			}
		list.clear();
		System.out.println("print data");
		
		for(Map.Entry entry:map.entrySet()) {
			
			if((int) entry.getValue()>1)
			{
				list.add((Integer)entry.getKey());
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter size of Array");
		int size=  sc.nextInt();
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		repatingArray(list);
		System.out.println(list);
		

	}

}
