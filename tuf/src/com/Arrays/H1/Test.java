package com.Arrays.H1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

    }

    private static void generateARow(int n) {
        long ans = 1;
        System.out.print(ans+" ");

        for (int i = 1; i < n; i++) {
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }


}
