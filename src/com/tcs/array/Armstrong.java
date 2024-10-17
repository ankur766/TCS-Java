package com.tcs.array;
import  java.util.*;

public class Armstrong
{
    public static void main(String[] args) {
       System.out.println("Enter number");
         Scanner sc=new Scanner(System.in);
         int num= sc.nextInt();
            int temp=num;
            int count=0;
            while(temp>0)
            {
                temp=temp/10;
                count++;
            }
            temp=num;
            int sum=0;
            while(temp>0)
            {
                int rem=temp%10;
                sum+=Math.pow(rem,count);
                temp=temp/10;
            }
            if(sum==num)
            {
                System.out.println("Armstrong");
            }
            else
            {
                System.out.println("Not Armstrong");
        }
    }
}