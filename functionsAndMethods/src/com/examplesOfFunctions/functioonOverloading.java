package com.examplesOfFunctions;

import java.util.Arrays;

public class functioonOverloading {
    public static void main(String[] args) {
        int ans = fun(2,4);
        System.out.println(ans);
        funs(2,32);
    }
    static int  fun(int a,int b){
        return a+b;
    }
    static void funs(int ...a){
        System.out.println(Arrays.toString(a));
        return ;
    }
}
