package com.Arrays.M1;

import java.util.ArrayList;
import java.util.Arrays;

public class M8SeparatePosNegInArray {
    public static void main(String[] args) {
        int[] arr = {5,3,-2,4,-1,-6};
        reArrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Optimal Approach
    // Tc = O(n)
    // Sc = O(n)
    private static void reArrange(int[] arr) {
        int[] ans = new int[arr.length];
        int pos=0,neg=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                ans[neg]=arr[i];
                neg+=2;
            }

            else{
                ans[pos]=arr[i];
                pos+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    // Brute Force
    // Tc = O(n)+O(n/2)
    // Sc = O(n)
//    private static void reArrange(int[] arr) {
//        ArrayList<Integer> pos = new ArrayList<>();
//        ArrayList<Integer> neg = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<0){
//                neg.add(arr[i]);
//            }
//            else{
//                pos.add(arr[i]);
//            }
//        }
//        for (int i = 0; i < arr.length/2; i++) {
//            arr[2*i]=pos.get(i);
//            arr[2*i+1]=neg.get(i);
//        }
//    }


}
