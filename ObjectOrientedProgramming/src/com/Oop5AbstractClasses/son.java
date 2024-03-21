package com.Oop5AbstractClasses;

public class son extends parent{

    @Override
    void carrier(String name) {
        System.out.println("i am a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("my name is " + name + " and my age is " + age);
    }
}
