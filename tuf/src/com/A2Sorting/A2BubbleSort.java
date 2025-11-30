package com.A2Sorting;

import java.util.Arrays;
//
//public class A2BubbleSort {
//    public static void main(String[] args) {
//        int[] arr= {13,46,24,52,20,9};
//        int n=arr.length;
//        bubbleSort(arr,n);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void bubbleSort(int[] arr,int n) {
//        int didSwap=0;
//        for(int i=n-1;i>=1;i--){
//            for(int j=0;j<=i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    didSwap=1;
//                }
//            }
//            if(didSwap==0){
//                break;
//            }
//            System.out.println("Runs");
//        }
//    }
//}


public class A2BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n= arr.length;
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i <=n-2; i++) {
            for (int j = 0; j <=n-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}