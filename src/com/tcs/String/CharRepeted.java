package com.tcs.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharRepeted {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
            System.out.println("Enter string");
            String str=sc.nextLine();
           HashMap<Character,Integer>mp= new HashMap<>();
           for(int i=0;i<str.length();i++){
            char val=str.charAt(i);
            if(mp.containsKey(val))
            {
                mp.put(val,mp.get(val)+1);
            }else{
                mp.put(val, 1);
            }
           }
           for( Map.Entry entry: mp.entrySet())
           {
            System.out.print(entry.getKey()+""+entry.getValue());
           }

    }
    
}
