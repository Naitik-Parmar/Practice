package com.Arrays.H1;

public class H2PascalsTrianglePrint1RowAtN {
    public static void main(String[] args) {
        int n = 5;
        printPascal(n);
    }

    // TC = O(n*r)
    // SC = O(1)
    private static void printPascal(int n) {
        int ans = 1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }
}
