package com.tcs.array;
import java.util.*;
public class PairSum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter 1st array Size");
    int n=sc.nextInt();
 

    int arr[]=new int[n];
    System.out.println("Enter element");

    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();

    }
    System.out.println("Enter 2nd array size");
    int nsize=sc.nextInt();

    int []arr2=new int[nsize];
System.out.println("Enter 2nd array Element");
    for(int i=0;i<nsize;i++)
    {
        arr2[i]=sc.nextInt();
    }
    System.out.println("Enter target");
    int target=sc.nextInt();
    for(int i=0;i<nsize;i++)
    {
        for(int j=0;j<nsize;j++)
        {if(i!=j){
            if(arr[i]+arr2[j]==target)
            {
                System.out.println(arr[i]+" "+arr[j]);
            }}
        }
    }
    }



    
}
