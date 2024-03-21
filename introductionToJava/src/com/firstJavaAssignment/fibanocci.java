package com.firstJavaAssignment;

import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
//            run a for loop up to the condition is true
            System.out.print(fibanoci(i) + "  ");
        }
    }
    public static int fibanoci(int n){
//        if n<=1 return
        if (n<=1){
            return n;
        } else {
//            return n-1 and n-2
            return fibanoci(n-1) + fibanoci(n-2);
        }
    }
}
