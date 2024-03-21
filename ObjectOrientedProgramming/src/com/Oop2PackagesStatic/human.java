package com.Oop2PackagesStatic;
// this is a class without run statement
// this is a static element example
public class human {
    int age;
    String name;
    int salary;
    boolean married;
    long population;
//    now make population static and we get
    static long populations;

    public human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;
//        we make populations static we use class name to print it
        human.populations += 2;
    }
}
