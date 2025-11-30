package com.naitik.R1Recursion_Level1Questions;

public class Q5SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(9342));
    }
    static int sumOfDigits(int n){
        if(n==0)
            return 0;
        return (n%10)+sumOfDigits(n/10);
    }
}
