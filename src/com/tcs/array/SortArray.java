package com.tcs.array;

import java.util.*;

import java.util.Scanner;

public class SortArray {

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
		System.out.println("Sort in acending order");
		list.sort(null);
		System.out.println(list);
		System.out.println("sort in decending order");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
	}

}
