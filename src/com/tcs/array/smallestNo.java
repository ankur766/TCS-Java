package com.tcs.array;

import java.util.ArrayList;
import java.util.Scanner;

public class smallestNo {
	public static int findsmallestNum(ArrayList<Integer>list)
	{ int min=Integer.MAX_VALUE;
		for(int val:list)
		{
			if(val<min)
			{
				min=val;
			}
		}
		return min;
		
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
		System.out.println("Smallest Num");
		System.out.println(findsmallestNum(list));
		
	
	}

	

}
