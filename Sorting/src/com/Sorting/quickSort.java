package com.Sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSorting(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSorting(int[] number, int low, int high){
//        this is the base condition low>=high
        if (low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
//        selecting the middle element as pivot
        int pivot = number[m];

        while (s <= e){
            while (number[s] < pivot){
                s++;
            }
            while (number[e] > pivot){
                e--;
            }
//            if violation occurs swap the elements
            if (s <= e){
                int temp = number[s];
                number[s] = number[e];
                number[e] = temp;
                s++;
                e--;
            }

//          calling recursion functions from here
//          low = e
            quickSorting(number, low, e);
//          high = s
            quickSorting(number, s, high);
        }
    }
}
