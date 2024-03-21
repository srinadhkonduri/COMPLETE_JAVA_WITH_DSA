package com.Oop4AccessControls;

public class objectDemo {
    int marks;
    float gpa;

    public objectDemo(int marks, float gpa) {
        this.marks = marks;
        this.gpa = gpa;
    }

    public objectDemo() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        objectDemo obj = new objectDemo(23,45.0f);
        System.out.println(obj);
    }
}
