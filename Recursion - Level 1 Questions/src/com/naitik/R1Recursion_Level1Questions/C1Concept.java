package com.naitik.R1Recursion_Level1Questions;

public class C1Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0)
            return;
        System.out.println(n);
        fun(--n);
    }
}
