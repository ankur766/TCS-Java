package com.tcs.array;

import java.util.*;

import java.util.Scanner;

public class CountFreqOfArray {
	public static void countFreqofArray(ArrayList<Integer>list)
	{//using Hasmap count freq
		HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
		for(int val:list)
		{
			if(map.containsKey(val))
			{
				map.put(val,map.get(val)+1);
			}
			else {
				map.put(val, 1);
			}
		}
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
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
		countFreqofArray(list);

	}

}
