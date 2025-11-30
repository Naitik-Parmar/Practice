package com.naitik.AssignmentQuestions;

import java.util.Scanner;

public class Q10 {
    public static void main (String[] args) {
        //code
        /*
        3
        1 3 2 4
        1 3 2 5
        1 3 2 6
         */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            System.out.println(fib(a,b,c,n));
        }
    }
    public static int fib(int a,int b,int c,int n){
        if(n==1){
            return a;
        }
        else if(n==2){
            return b;
        }
        else if(n==3){
            return c;
        }
        else{
            return fib(a,b,c,n-1)+fib(a,b,c,n-2)+fib(a,b,c,n-3);
        }
    }
}
