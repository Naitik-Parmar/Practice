package com.naitik.R1Recursion_Level1Questions;

public class Q10NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int n=14;
        System.out.println(numberOfSteps(n));
    }
    public static int numberOfSteps(int n){
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0)
            return c;
        int rem=n%2;
        if(rem==0){
            return helper(n/2,c+1);
        }
        return helper(n-1,c+1);
    }
}
