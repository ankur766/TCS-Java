package com.tcs.array;
import java.util.*;
public class SumOfElement {
	public static int sum(ArrayList<Integer>list)
	{int sum=0;
		for(int val:list)
		{
			sum+=val;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int take_size= sc.nextInt();
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<take_size;i++)
		{list.add(sc.nextInt());
			
		}
		System.out.println(sum(list));
	}

}
