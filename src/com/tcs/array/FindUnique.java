package com.tcs.array;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class FindUnique {
    public static ArrayList<Integer> findUnique(ArrayList<Integer>list,ArrayList<Integer>uniquelist)
    {
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int val:list)
        {
            if(map.containsKey(val))
            {
               map.put(val, map.get(val)+1);
            }
            else
            {
                map.put(val,1);
            }
        }
        for(int val:map.keySet())
        {
            if(map.get(val)==1)
            {
                uniquelist.add(val);
            }
        }
        return uniquelist;

    }
    public static void main(String[] args) {
          Scanner sc=new Scanner (System.in);
        int take_size=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<take_size;i++)
        {
            list.add(sc.nextInt());
        }
        ArrayList<Integer>uniqueList=new ArrayList<>();
       findUnique(list,uniqueList);
       System.out.println(uniqueList);
;
    }
    
}
