package com.tcs.String;
import java.util.Scanner;
public class  Consecutive2vowels{
    public static boolean vowel(char ch)
    {
        if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
        {
            return true;
        }
       
            return false;           
        
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String[] str = s.split(" ");
        int count=0;
       for(int i=0;i<str.length;i++)
       {
        for(int j=1;j<str[i].length();j++)
        {
            if( vowel(str[i].charAt(j-1))==true  && vowel(str[i].charAt(j))==true)
            {
                count++;
                break;
            }


        }

    }
    System.out.println(count);
    

    }
    
}