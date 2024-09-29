package com.tcs.array;

import java.util.ArrayList;
import java.util.Scanner;

public class largestNum {
	public static int largestNum(ArrayList<Integer>list)
	{
		int max=Integer.MIN_VALUE;
		
		for(int val:list)
		{
			if(val>max)
			{
				max=val;
			}
			
		}
		return max;
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
	
		System.out.println("Largest NUM");
		System.out.println(largestNum(list));
	
	}


}
