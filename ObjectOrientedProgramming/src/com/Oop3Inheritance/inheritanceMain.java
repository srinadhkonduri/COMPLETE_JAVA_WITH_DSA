package com.Oop3Inheritance;

public class inheritanceMain {
    public static void main(String[] args) {
        inheritance box = new inheritance();
        System.out.println(box.l);
        System.out.println(box.h);
        System.out.println(box.w);
        box.print();

        inherit box1 = new inherit(1.0,2.0,3.0,9.0);
        System.out.println(box1.weight);
        System.out.println(box.h);
        System.out.println(box1.l);
        System.out.println(box1.w);



        inherit box4 = new inherit();
        System.out.println(box4.h);
    }
}
