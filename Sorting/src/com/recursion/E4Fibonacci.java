package com.recursion;

public class E4Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));

        System.out.println(fibonacciFormula(50));
        for (int i = 1; i < 11; i++) {
            System.out.println(fibonacciFormula(i));
        }
    }
    static int fibonacciFormula(int n){
        return (int) (Math.pow((( 1+ Math.sqrt(5)) / 2),n)/Math.sqrt(5));
    }
    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
