package com.tcs.SearchingAndSorting;
import  java.util.*;
public class MergeTwoSortedArray {
    public static int[] merge(int arr1[], int arr2[]) {
        int newsize=arr1.length+arr2.length;
        int []arr=new int [newsize];
        int size1=arr1.length;
        int size2=arr2.length;
        int i=0;
        int j=0;
        int k=0;
       while(i < size1 && j < size2) {
            if(arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
       while(i < size1) {
            arr[k++] = arr1[i++];
        }

        // If there are remaining elements in arr2
        while(j < size2) {
            arr[k++] = arr2[j++];
        }   
        
        return arr;	
    }



public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    
  
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }
        int[] ans = new int[m+n];
        ans = merge(arr1, arr2);
        for(int i=0;i<m+n;i++)
        {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
      
    
}
    
}
