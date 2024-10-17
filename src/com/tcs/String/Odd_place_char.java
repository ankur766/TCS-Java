package com.tcs.String;

import java.util.Scanner;

public class Odd_place_char {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(i%2!=0)
            {
                System.out.print(str.charAt(i));
            }
        }

    }
    
}
