package com.ArrayProblemMedium;

import java.util.Arrays;

public class longestConsecutiveOne {
    public static int longestSuccessiveElements(int []a) {
        int n = a.length;
        if (n == 0) return 0;

        //sort the array:
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        //find longest sequence:
        for (int j : a) {
            if (j - 1 == lastSmaller) {
                //a[i] is the next element of the
                //current sequence.
                cnt++;
                lastSmaller = j;
            } else if (j != lastSmaller) {
                cnt = 1;
                lastSmaller = j;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4, 45, 56, 76, 32};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
