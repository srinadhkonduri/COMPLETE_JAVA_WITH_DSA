package com.hashing;

import java.util.Scanner;
public class characterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ;
        str = sc.nextLine();

//        precomputing code for java
        int[] hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }

        int  q;
        q = sc.nextInt();
        while (q-- > 0){
            char  c;
            c = sc.next().charAt(0);
//            fetching
            System.out.println(hash[c - 'a']);
        }
    }
}
