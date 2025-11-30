package com.naitik.R1Recursion_Level1Questions;

public class Q2_1toN {
    public static void main(String[] args) {
//        fun(5);
        System.out.println();
        funBoth(5);
    }
    static void fun(int n){
        if(n==0)
            return;
        fun(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if(n==0)
            return;
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
