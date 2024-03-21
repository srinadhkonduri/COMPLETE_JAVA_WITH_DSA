package com.Oop5AbstractClasses;

public class daughter extends parent{
    @Override
    void carrier(String name) {
        System.out.println("i want to become an " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("i love " + name + " and her age is " + age);
    }
}
