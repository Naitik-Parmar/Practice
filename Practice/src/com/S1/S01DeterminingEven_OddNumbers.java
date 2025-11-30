package com.S1;

/*
    Determining Even/Odd Numbers
    Difficulty: Easy
    Topics: Basic Programming
    Description: Write a program to check whether a number is even or odd.
    Example:
    Input: number = 4
    Output: Even
    Explanation: Since 4 is divisible by 2, it is an even number.
 */

import java.util.Scanner;
public class S01DeterminingEven_OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String result = evenOdd(n);
        System.out.println(result);

        sc.close();

    }
    static String evenOdd(int n){
        return (n%2==0)?"Even":"Odd";
    }
}
