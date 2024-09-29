package com.tcs.array;

import java.util.*;

public class RearrangeArray {
	public static ArrayList<Integer> arrangeArray(ArrayList<Integer>list)
	{
			if(list.size()<=1)
			{
				return list;
			}
			Collections.sort(list);
			int start=list.size()/2;
			int end=list.size()-1;
			while(start<end)
				{Collections.swap(list, start, end);
			    start++;
			   end--;}
			return list;	   
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
		arrangeArray(list);
		System.out.println(list);

	}

}
