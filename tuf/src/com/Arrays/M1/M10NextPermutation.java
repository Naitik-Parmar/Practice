package com.Arrays.M1;

import java.util.Arrays;

public class M10NextPermutation {
    public static void main(String[] args) {
//        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        int[] arr = {3, 2, 1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }

    // Optimal Approach
    // Tc = O(3n)
    // Sc = O(n) if considering changes in same array, otherwise O(1)
    // With checking index==-1 case
    private static void nextPermutation(int[] arr) {
        int n=arr.length;
        int index=-1;

        for (int i = n-2; i >=0; i--) {
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverseArr(arr,0,n-1);
            return;
        }

        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                swapArray(arr,i,index);
                break;
            }
        }
        reverseArr(arr,index+1,n-1);
    }

    private static void swapArray(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    private static void reverseArr(int[] arr, int start, int end) {
        while(start<end){
            swapArray(arr,start,end);
            start++;
            end--;
        }
    }


    // Without checking index==-1 case
//    private static void nextPermutation(int[] arr) {
//        int n=arr.length;
//        int index=-1;
//
//        // find the break point
//        for(int i=n-2;i>=0;i--){
//            if(arr[i]<arr[i+1]){
//                index=i;
//                break;
//            }
//        }
//        // find smallest>arr[i] from back side
//        for(int i=n-1;i>index;i--){
//            if(arr[i]>arr[index]){
//                swapArray(arr,i,index);
//                break;
//            }
//        }
//        int i=index+1,j=n-1;
//        while(i<=j){
//            swapArray(arr,i,j);
//            i++;
//            j--;
//        }
//    }
//
//    private static void swapArray(int[] arr, int i, int index) {
//        int temp=arr[i];
//        arr[i]=arr[index];
//        arr[index]=temp;
//    }
}
