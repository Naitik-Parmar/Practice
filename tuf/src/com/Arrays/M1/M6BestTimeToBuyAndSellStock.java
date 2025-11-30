package com.Arrays.M1;

public class M6BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int ans = stock(arr);
        System.out.println(ans);
    }

    // Brute Force
    // Tc = O(n^2)
    // Sc = O(1)
    private static int stock(int[] arr) {
        int profit=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    int cost = arr[j]-arr[i];
                    profit=Math.max(profit,cost);
                }
            }
        }
        return profit;
    }

    // Optimal Approach
    // Tc = O(n)
    // Sc = O(1)
//    private static int stock(int[] arr) {
//        int profit=0;
//        int mini = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            int cost = arr[i]-mini;
//            profit = Math.max(profit,cost);
//            mini = Math.min(mini,arr[i]);
//        }
//
//        return profit;
//    }
}
