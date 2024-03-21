package com.programs;

public class fibonacciAdvanced {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(formula(i));
        }
        System.out.println("---------");
        System.out.println(formula(50));
    }

    static int formula(int n){
        // just for demo, use long instead
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

}