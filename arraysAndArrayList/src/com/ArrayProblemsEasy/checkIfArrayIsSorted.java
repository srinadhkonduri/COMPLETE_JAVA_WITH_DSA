package com.ArrayProblemsEasy;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,1};
        System.out.println(check(arr));
    }
    public static boolean check(int[] number) {
        if(number.length == 1)
            return true;
        int count = 0;
        for(int i = 1; i < number.length; i++)
            if(number[i - 1] > number[i])
                count++;
        if(number[number.length - 1] > number[0])
            count++;
        return count <= 1;
    }
}
