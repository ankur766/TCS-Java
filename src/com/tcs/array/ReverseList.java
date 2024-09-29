package com.tcs.array;

import java.util.*;


public class ReverseList {
	public static void reverseList(ArrayList<Integer>list)
	{
		int start=0;
		int end=list.size()-1;
		while(start<end)
		{
			int a=list.get(start);
			int b=list.get(end);
			list.set(start, b);
			list.set(end, a);
			start++;
			end--;
			
		}
	}
	public static void usingMethod(ArrayList<Integer>list)
	{
		int start=0;
		int end=list.size()-1;
		while(start<end)
		{//Using Swap Mehtod
			Collections.swap(list, start, end);
			start++;
			end--;
			
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter size of Array");
		int size=  sc.nextInt();
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		reverseList(list);
		System.out.println("Using ittrative menthod");
		
		System.out.println(list);
		
		 System.out.println("using swap Method");
		usingMethod(list);
		System.out.println(list);

	}

}
