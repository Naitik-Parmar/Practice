package com.patterns;

public class P31Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }
    static void pattern31(int N){
        int n=2*N;
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n ; col++) {
                int everyIndex=n-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(everyIndex+" ");
            }
            System.out.println();
        }
    }
}
