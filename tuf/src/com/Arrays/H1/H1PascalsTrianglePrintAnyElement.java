package com.Arrays.H1;

public class H1PascalsTrianglePrintAnyElement {
    public static void main(String[] args) {
        int n = 10;
        int r = 3;

        if (r > r) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println(pascal(n,r));
    }

    // Tc = O (r)
    // Sc = O(1)
    private static long pascal(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
}
