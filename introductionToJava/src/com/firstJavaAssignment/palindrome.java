package com.firstJavaAssignment;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (palindrome(input)){
            System.out.println("string is palindrome");
        } else {
            System.out.println("string is not palindrome");
        }

    }
//    creating a method
    public static boolean palindrome(String str){
        int left =0;
        int right = str.length()-1;
        while (left<right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
