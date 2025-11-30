package com.Arrays.M1;

public class M4KadanesAlgorithmOrMaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {
                -7 ,-8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10 };
        int ans = maxSubArraySum(arr);
        System.out.println(ans);
    }

    // Better Approach
    // Tc = O(n^2)
    // Sc = O(1)
//    private static int maxSubArraySum(int[] arr) {
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            int sum=0;
//            for (int j = i; j < arr.length ; j++) {
//                sum=sum+arr[j];
//                max=Math.max(sum,max);
//            }
//        }
//        // If question mentions to return 0 in case of negative (-) subarray maximum then use below check
//        if(max<0) max=0;
//
//        return max;
//    }


    // Max SubarraySum with returning Subarray
    private static int maxSubArraySum(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int start=0;
        int ansStart=0,ansEnd=0;

        for (int i = 0; i < arr.length; i++) {
            if(sum==0){
                start=i;
            }
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
//        if(max<0) max=0;
        System.out.print("Maximum Subarray is : [");
        for (int j = ansStart; j <=ansEnd; j++) {
            System.out.print(arr[j]+", ");
        }
        System.out.print("]");
        System.out.println();
        return max;
    }

    // Brute Force
    // Tc = O(n^3)
    // Sc = O(1)
//    private static int maxSubArraySum(int[] arr) {
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum=0;
//                for (int k = i; k <=j ; k++) {
//                    sum=sum+arr[k];
//                    max=Math.max(sum,max);
//                }
//            }
//        }
//        return max;
//    }
}
