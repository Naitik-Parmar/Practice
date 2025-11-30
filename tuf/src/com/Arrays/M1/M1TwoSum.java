package com.Arrays.M1;

import java.util.HashMap;

public class M1TwoSum {
    public static void main(String[] args) {
//        int[] arr = {1,1,2,5,8,4,6};
        int[] arr = {575, 330, 339, 584, 239, 31, 173, 929, 967};
        int target = 204;
        String res = twoSum(arr,target);
        System.out.println(res);
    }

    // Optimal Approach
    // Tc = O(n) + O(nlogn) => O(n)
    // Sc = O(1)
    private static String twoSum(int[] arr, int target) {
        int left=0,right= arr.length-1;
        String ans="NO";
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum<target){
                left++;
            } else if (sum>target) {
                right--;
            }
            else{
                ans="YES";
                break;
            }
        }
        return ans;
    }

    // Better Approach
    // Tc = O(n)
    // Sc = O(n)
//    private static String twoSum(int[] arr, int target) {
//        String ans = "NO";
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            int a=arr[i];
//            int more=target-a;
//            if(map.containsKey(more)){
//                ans="YES";
//            }
//            map.put(a,i);
//        }
//        return ans;
//    }

    // Brute Force
    // Tc = O(n^2)
    // Sc = O(1)
//    private static String twoSum(int[] arr, int target){
//        String ans = "NO";
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length ; j++) {
//                if(arr[i]+arr[j]==target){
//                    ans="YES";
//                }
//            }
//        }
//        return ans;
//    }
}
