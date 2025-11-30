package com.Arrays.M1;

import java.util.HashMap;
import java.util.Map;

public class M3MajorityElementMoreThanHalfArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        int element = majorityELement(arr);
        System.out.println(element);
    }
    // Optimal Approach
    // Tc = O(n) + O(n) => O(2n) --> 2nd loop for checking majority element or verifying
    //       In Case, question states that the array must contain majority element then no need to use 2nd loop
    // Sc = o(1)
    private static int majorityELement(int[] arr){
        int c=0;
        int el=0;
        int n= arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(c==0){
                c=1;
                el=arr[i];
            }
            else if(el==arr[i]){
                c++;
            }
            else{
                c--;
            }
        }
        int c1=0;
        for (int i = 0; i < arr.length; i++) {
            if(el==arr[i]){
                c1++;
            }
            if(c1> arr.length/2){
                return el;
            }
        }
        return -1;
    }

    // Better Approach
    // Tc = O(nlogn)
    // Sc = O(n) // HashMap
//    private static int majorityELement(int[] arr) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            int val = map.getOrDefault(arr[i],0);
//            map.put(arr[i],val+1);
//        }
//        for(Map.Entry<Integer, Integer> it : map.entrySet()){
//            if(it.getValue()> arr.length/2){
//                return it.getKey();
//            }
//        }
//        return -1;
//    }


    // Brute Force
    // Tc = O(n^2)
    // Sc = O(1)
//    private static int majorityELement(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int c=0;
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i]==arr[j]){
//                    c++;
//                }
//            }
//            if(c>arr.length/2){
//                return arr[i];
//            }
//        }
//        return -1;
//    }
}
