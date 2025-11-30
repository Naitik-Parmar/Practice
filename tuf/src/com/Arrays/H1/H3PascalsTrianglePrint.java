package com.Arrays.H1;

import java.util.ArrayList;
import java.util.List;

public class H3PascalsTrianglePrint {
    public static void main(String[] args) {
        int n = 10;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    // Tc = O(n^2) where n = number of rows
    // Sc = o(1) only using space to store the answer

    private static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            res.add(generateRow(i));
        }
        return res;
    }
    static List<Integer> generateRow(int n){
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        long ans = 1;
        for (int i = 1; i <n; i++) {
            ans=ans*(n-i);
            ans=ans/i;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

}
