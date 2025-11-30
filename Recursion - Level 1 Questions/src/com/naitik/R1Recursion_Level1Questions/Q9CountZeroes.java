package com.naitik.R1Recursion_Level1Questions;

public class Q9CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(2030100));
    }

    private static int countZeroes(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0)
            return c;
        int rem=n%10;
        if(rem==0)
            return helper(n/10,c+1);
        return helper(n/10,c);
    }

}
