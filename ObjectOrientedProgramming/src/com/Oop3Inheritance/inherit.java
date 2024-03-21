package com.Oop3Inheritance;

public class inherit extends inheritance {
    double weight;

    public inherit(double l, double h, double w, double weight) {
        super(l, h, w);  // this is a super keyword
        this.weight = weight;
    }

    public inherit() {
        System.out.println("hello world");
    }
}