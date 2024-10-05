package com.tcs.array;
import java.util.*;

public class SwapElement {
    
    // Method to swap elements of the ArrayList
    public static void swap(ArrayList<Integer> list) {
        int end = list.size() - 1;
        int start = 0;
        
        // Swapping elements from both ends moving towards the center
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Creating a scanner for input
        Scanner sc = new Scanner(System.in);

     
        int take_size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < take_size; i++) {
            list.add(sc.nextInt());
        }

     
        swap(list);
   
        System.out.println(list);

   
        sc.close();
    }
}
