package com.naitik.R1Recursion_Level1Questions;

public class Q8Palindrome {
    public static void main(String[] args) {
//        reverse1(1824);
//        System.out.println(sum);
        System.out.println(rev2(2354));
        System.out.println(palindrome(12321));
        System.out.println(palindrome(1232));
    }
    static int sum=0;
    static void reverse1(int n){
        if(n==0)
            return;
        int rem=n%10;
        sum=sum*10+rem;
        reverse1(n/10);
    }

    static int rev2(int n){
        int digits=(int)Math.log10(n)+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    static boolean palindrome(int n){
        return n==rev2(n);
    }
}
