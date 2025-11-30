package com.naitik.R1Recursion_Level1Questions;

public class Q4SumOfNto1 {
    public static void main(String[] args) {
        System.out.println(sumFun(10));
    }
    static int sumFun(int n){
        if(n==1)
            return 1;
        return n+sumFun(n-1);
    }
}
