package com.tcs.array;

import java.util.*;
public class SortZeroOne {
    public static void sort(int []arr)
    {
        int num=0;
        for(int i=0;i<arr.length;i++)
           {
                if(arr[i]!=0)
                {
                    num=i;
                    break;
                }
          }

          int i=num+1;
          
           while(i<arr.length)
           {
               if(arr[i]==0)
               {
                   int temp=arr[num];
                   arr[num]=arr[i];
                   arr[i]=temp;
                   num++;
               }
               i++;
           }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int []arr= new int[7];
            System.out.println("Enter element");
            for(int i=0;i<7;i++)
            {
                arr[i]=sc.nextInt();
            }
            sort(arr);
            for(int val: arr)
            {
                System.out.println(val);
            }

    }
    
}
