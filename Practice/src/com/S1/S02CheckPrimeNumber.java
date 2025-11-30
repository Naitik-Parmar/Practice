/*
    Checking for Prime Numbers
    Difficulty: Easy
    Topics: Basic Programming, Number Theory
    Description: Write a program to determine if a number is prime.
    Example:
    Input: number = 7
    Output: Prime
    Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.
 */


package com.S1;

import java.util.Scanner;
public class S02CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkPrime(n));
    }
    static String checkPrime(int n){
        if(n<=1){
            return "Not Prime";
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }
}
