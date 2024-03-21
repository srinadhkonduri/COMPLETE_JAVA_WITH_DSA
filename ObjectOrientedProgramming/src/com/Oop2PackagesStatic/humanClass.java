package com.Oop2PackagesStatic;

public class humanClass {
    public static void main(String[] args) {
        human nani = new human(20, "nani", 50000, false);
        System.out.println(nani.age);
        System.out.println(nani.name);
        System.out.println(nani.salary);
        System.out.println(nani.married);
        System.out.println(nani.population);
//        while printing output we can use class name of the program
        System.out.println(human.populations);
        fun();

    }

    static void fun(){
        System.out.println("hi");
//        you can access a nonstatic variable in static variable
//        by using the main class name of the program by creating
//        a new class
        humanClass obj = new humanClass();
        obj.greeting();
    }


    void greeting(){
//        this is a nonstatic variable cant be accessed in main class
//        we should an object to access the file
        System.out.println("hello world");
    }
}
