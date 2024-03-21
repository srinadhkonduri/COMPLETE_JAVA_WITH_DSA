package com.ArrayProblemsEasy;

import java.util.Arrays;
// brute force approach
public class largestElementInTheArray {
    public static void main(String[] args) {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: " + sort(arr1));

        int arr2[] =  {8,10,5,7,9};
        System.out.println("The Largest element in the array is: " + sort(arr2));
    }
    static int sort(int arr[]) {
//        sorting using collection framework
        Arrays.sort(arr);
//        return array to its array last length that is array.length
        return arr[arr.length - 1];
    }
}
