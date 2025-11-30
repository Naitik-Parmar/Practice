package com.Arrays.M1;

import java.util.ArrayList;
import java.util.Collections;

public class M11LeaderInAnArray {
    public static void main(String[] args) {
        int[] arr = {17, 16, 17, 4, 3, 5, 2,};
        ArrayList<Integer> ans = leader(arr);
        System.out.println(ans);
    }

    // Optimal Approach
    // Tc = O(n)
    // Sc = O(n)
    private static ArrayList<Integer> leader(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]>=max){
                max=arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    // Brute Force
    // Tc = O(n^2)
    // Sc = O(n) -> for ans array
//    private static ArrayList<Integer> leader(int[] arr) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag=true;
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[j]>arr[i]){
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag){
//                ans.add(arr[i]);
//            }
//        }
//        return ans;
//    }
}
