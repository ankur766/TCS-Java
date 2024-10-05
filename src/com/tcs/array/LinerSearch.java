package com.tcs.array;

import java.util.*;

public class LinerSearch {
public static Boolean search(ArrayList<Integer>list,int search)
{
    boolean found=false;
    for(int val:list)
    {
        if(val==search)
        {
            found=true;
            break;
        }
    }
    return found;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int take_size=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<take_size;i++)
        {
            list.add(sc.nextInt());
        }
        int search=sc.nextInt();
       System.out.println( search(list ,search));
;
    }
    
}
