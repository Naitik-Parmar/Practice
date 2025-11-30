package com.naitik.AssignmentQuestions;

public class Q7 {
    public static void main(String[] args) {
        Q7 q=new Q7();
        System.out.println(q.fib(4));
    }
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
