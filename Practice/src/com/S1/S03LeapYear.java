package com.S1;

/*
    Validating Leap Years
    Difficulty: Easy
    Topics: Basic Programming, Date Handling
    Description: Write a program to check if a given year is a leap year.
    Example:
    Input: year = 2020
    Output: Leap Year
    Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.
 */

import java.util.Scanner;
public class S03LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(leapYear(n));
    }
    static String leapYear(int n){
        return ((n%400==0) || (n%4==0 && n%100!=0))?"Leap Year":"Not a Leap Year";
    }
}
