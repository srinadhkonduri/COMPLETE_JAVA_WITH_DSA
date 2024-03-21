package com.ArrayProblemMedium;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                + ans[1] + "]");
    }

    public static int[] twoSum(int n, int []arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int answer = target - num;
            if (mpp.containsKey(answer)) {
                ans[0] = mpp.get(answer);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }
}

