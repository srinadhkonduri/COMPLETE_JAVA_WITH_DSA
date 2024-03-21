package com.Oop3Inheritance;
//creating inheritance classes
public class inheritance {
//    first we have to declare variables
    double h;
    double w;
    double l;

//    then we need to create constructor
    inheritance () {
        super();
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }


    inheritance(double l , double h, double w){
        super();
        this.h = h;
        this.w =w;
        this.l = l;
    }

    public void print(){
        System.out.println("hello world");
    }
}
