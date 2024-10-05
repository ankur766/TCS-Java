package com.tcs.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicate {
    public static ArrayList<Integer>finddupicate(ArrayList<Integer>list, ArrayList<Integer>findDuplcateNo)
    {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int val:list)
        {
            if(map.containsValue(val))
            {
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }
        }

        for(int val:map.keySet())
        {   if(map.get(val)>1)
            {
                findDuplcateNo.add(val);
            }
            
        }
        return  findDuplcateNo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
         int total_size=sc.nextInt();
          for(int i=0;i<total_size;i++)
          {list.add(sc.nextInt());

          }
          ArrayList<Integer>findDuplcateNo=new ArrayList<>();
          finddupicate(list,findDuplcateNo);
          System.out.println(findDuplcateNo);
    }
    
}
