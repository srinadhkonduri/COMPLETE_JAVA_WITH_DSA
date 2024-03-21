package com.examplesOfFunctions;

import java.util.Arrays;

public class arrayNumberChange {
    public static void main(String[] args) {
        double [] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
//    creating method
    public static void change(double [] nums){
        nums[2] =3.5;
    }
}
