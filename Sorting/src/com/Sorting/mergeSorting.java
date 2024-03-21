package com.Sorting;

import java.util.Arrays;

public class mergeSorting {
    public static void main(String[] args) {
        int [] arr = {5,4,1,2,3};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
//        base condition arr.length == 1 then return arr
        if (arr.length == 1){
            return arr;
        }
//      creating a middle element which is length divided by 2
        int mid = arr.length / 2;

//      left arr , 0 , middle
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
//      right arr, middle , arr.length
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left , right);
    }

    private static int[] merge(int[] first, int[] second) {
//        create new int and add length of first array and length of second array
        int [] mix = new int[first.length+second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
