package com.naitik.R1Recursion_Level1Questions;

public class Q1Nto1 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0)
            return;
        System.out.println(n);
        fun(n-1);
    }
}
