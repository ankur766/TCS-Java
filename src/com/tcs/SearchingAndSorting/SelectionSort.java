package com.tcs.SearchingAndSorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionsort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int minidx=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minidx])
                {
                    minidx=j;
                }
            }
            if(minidx!=i)
            {
                int temp=arr[minidx];
                arr[minidx]=arr[i];
                arr[i]=temp;
            }
        }
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("befor Sort");
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        System.out.println("");
       selectionsort(arr);
       System.out.println("After Sort");
         for(int val:arr)
         {
              System.out.print(val+" ");
         }
     }

    }
    

