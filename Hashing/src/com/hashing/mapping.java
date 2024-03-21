package com.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class mapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
//            O(N) time complexity
            arr[i] = sc.nextInt();
        }
//      precomputing
//      using collection framework in java we code this program
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (map.containsKey(key)) freq = map.get(key); // fetching from the map
            freq++;
            map.put(key, freq);
            // inserting into the map
        }

        int q;
        q = sc.nextInt();
        while (q-- != 0){
            int number;
            number = sc.nextInt();
//            fetching
            if (map.containsKey(number))
            {
                System.out.println(map.get(number));
            }
            else
            {
                System.out.println(0);
            }
        }
    }
}