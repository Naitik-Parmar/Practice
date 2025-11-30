package com.Arrays.E4;

import java.util.HashMap;
import java.util.Map;

public class A16LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int sum=3;
//        int ans = lswsk(arr,sum);
//        System.out.println(ans);
        
        int ans=longestSubarrayWithSumK(arr, sum);
        System.out.println(ans);
    }

    // Optimal Approach
    // Tc = O(2n)
    // Sc = O(1)
    private static int longestSubarrayWithSumK(int[] arr, int k) {
        int n=arr.length;
        HashMap<Long,Integer> prefixSumMap = new HashMap<>();
        int left=0,right=0;
        int maxLen=0;
        long sum=arr[0];

        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen, right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }

        return maxLen;
    }

    // Better Approach
    // Tc = O(n)
    // Sc = O(n)

    private static int lswsk(int[] arr, int k) {
        HashMap<Long,Integer> prefixSumMap = new HashMap<>();
        long sum=0;
        int n= arr.length;
        int maxLen=0;

        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(sum==k){
                maxLen= Math.max(maxLen,i+1);
            }

            long rem = sum-k;
            if(prefixSumMap.containsKey(rem)){
                int len = i-prefixSumMap.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!prefixSumMap.containsKey(rem)){
                prefixSumMap.put(sum,i);
            }
        }

        return maxLen;

    }


    // Brute Force
    // Tc = O(n^2)
    // Sc = O(1)
//    private static int lswsk(int[] arr, int sum) {
//        int len=0;
//        for (int i = 0; i < arr.length; i++) {
//            int s=0;
//            for (int j = i; j < arr.length; j++) {
//                s=s+arr[j];
//                if(s==sum){
//                    len=Math.max(len,j-i+1);
//                }
//            }
//        }
//        return len;
//    }

    // Brute Force
    // Tc = O(n^3)
    // Sc = O(1)
//    private static int lswsk(int[] arr, int sum) {
//        int len=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int s=0;
//                for (int k = i; k <=j ; k++) {
//                    s=s+arr[k];
//                }
//                if(s==sum){
//                    len=Math.max(len,j-i+1);
//                }
//            }
//        }
//        return len;
//    }
}
