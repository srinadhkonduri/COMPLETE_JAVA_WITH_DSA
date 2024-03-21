package com.Oop1Classes;

public class wrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
    }


//    now this swap function is in pass by reference
    static void swap(int a ,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
