package com.Arrays.E2;

import java.util.Arrays;

public class A7RightRotateByDPlaces {
    public static void main(String[] args) {
        // 2345671 - 3456712 - 4567123
        int[] arr = {1,2,3,4,5,6,7}; // 7654321 ->  5671234
        int d=3;
        rrbyd(arr,d);
        System.out.println(Arrays.toString(arr));
    }

    private static void rrbyd(int[] arr, int k) {
        int n= arr.length;
        int d = k % arr.length;
        int[] temp = new int[d];

        for(int i=0;i<d;i++){
            temp[i]=arr[n-d+i];
        }
        for(int i=0;i<n-d;i++){
            arr[i+d]=arr[i];
        }
        for(int i=0;i<d;i++) {
            arr[i] = temp[i];
        }
    }


    // Optimal Approach
    // Tc = O(2n)
    // Sc = O(1)
//    private static void rrbyd(int[] arr, int d) {
//        int n=arr.length;
//        d=d%n;
//        rev(arr,0,n-1);
//        rev(arr,0,d-1);
//        rev(arr,d,n-1);
//    }
//
//    private static void rev(int[] arr, int start, int end) {
//        while(start<=end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
}
