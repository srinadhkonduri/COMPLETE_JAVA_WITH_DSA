package com.Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr = {2,4,5,1,3};
        for (int i = 1; i <arr.length ; i++) {
            int current = arr[i];
//            assume that smallest number is currently i
            int j = i-1;
            while (j>=0 && current <= arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
