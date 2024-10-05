package com.tcs.SearchingAndSorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int []arr)
    {
       for(int i=0;i<arr.length;i++)
       {
        for(int j=1;j<(arr.length-i);j++)
        {
            if(arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
       }
    }

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {System.out.println("enter index of  :"+i);
            arr[i]=sc.nextInt();
        }
       bubbleSort(arr);
       for(int val:arr)
       {
            System.out.print(val+" ");
       }

    }
    
    
}
