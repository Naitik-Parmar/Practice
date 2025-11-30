package com.naitik.R1Recursion_Level1Questions;

public class Q3ProductOfNto1 {
    public static void main(String[] args) {
        System.out.println(fun(7));
    }
    static int fun(int n){
        if(n==1)
            return 1;
        return n*(fun(n-1));
    }
}
