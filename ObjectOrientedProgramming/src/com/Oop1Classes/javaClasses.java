package com.Oop1Classes;

public class javaClasses {
    public static void main(String[] args) {
//        creating own data type by using classes in java
        student nani = new student();
        System.out.println(nani.rollNo);
        System.out.println(nani.name);
        System.out.println(nani.marks);


        System.out.println("-------");


        student krishna = new student(34, "krishna", 45.7f);
        System.out.println(krishna.rollNo);
        System.out.println(krishna.name);
        System.out.println(krishna.marks);

        System.out.println("-----");

        student arjun = new student(45 , "arjun" , 56.9f);
        System.out.println(arjun.rollNo);
        System.out.println(arjun.name);
        System.out.println(arjun.marks);


    }
//    creating an own class name with the help of class interface
    static class student {
        int rollNo;
        String name;
        float marks;


//        we need to create a constructor to access the values in the code
//        which indicates public class name brackets

//    this is a constructor
        public student() {
        this.rollNo = 12;
        this.name = "ironman";
        this.marks = 56;
        }

    public student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
}
