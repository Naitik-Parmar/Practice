package com.naitik.R1Recursion_Level1Questions;

public class Main {
    public static void main(String[] args) {
        System.out.println(fun(3252));
    }
    static int fun(int n){
        int digit=(int)Math.log10(n)+1;
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        if(n%10==n)
            return n;
        int rem=n%10;
        return rem*(int)Math.pow(10,digit-1) + helper(n/10,digit-1);
    }
}