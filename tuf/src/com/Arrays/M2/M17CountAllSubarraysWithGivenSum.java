package com.Arrays.M2;

import java.util.HashMap;

public interface M17CountAllSubarraysWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        int ans = countAllSubArraysWithGivenSum(arr,k);
        System.out.println(ans);
    }

    // Better Approach
    // Tc = O(n^2)
    // Sc = O(1)
    static int countAllSubArraysWithGivenSum(int[] arr, int k) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length ; j++) {
                sum+=arr[j];
                if(sum==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    // Brute Force Approach
    // Tc = O(n^3)
    // Sc = O(1)
//    static int countAllSubArraysWithGivenSum(int[] arr, int s) {
//        int cnt = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length ; j++) {
//                int sum = 0;
//                for (int k = i; k <=j ; k++) {
//                    sum+=arr[k];
//                }
//                if(sum==s){
//                    cnt++;
//                }
//            }
//        }
//        return cnt;
//    }


    // Optimal Approach
    // Tc = O(n)
    // Sc = O(n)
//    static int countAllSubArraysWithGivenSum(int[] arr,int k) {
//        int prefixSum = 0;
//        int cnt = 0;
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0,1);
//
//        for (int i = 0; i < arr.length; i++) {
//            prefixSum += arr[i];
//            int remove = prefixSum-k;
//            cnt+=map.getOrDefault(remove,0);
//            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
//        }
//
//        return cnt;
//    }
}
