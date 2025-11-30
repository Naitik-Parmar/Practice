package com.naitik.R1Recursion_Level1Questions;

public class Q6ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(347));
    }
    static int productOfDigits(int n){
        if(n%10==n)
            return n;
        return (n%10)*productOfDigits(n/10);
    }
}
