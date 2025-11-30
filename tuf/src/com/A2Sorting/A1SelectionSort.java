package com.A2Sorting;

import java.util.Arrays;
//
//public class A1SelectionSort {
//    public static void main(String[] args) {
//        int[] arr = {13,46,24,52,20,9};
//        int n=arr.length;
//
//        selectionSort(arr,n);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void selectionSort(int[] arr, int n) {
//        for(int i=0;i<=n-2;i++){
//            int min=i;
//            for(int j=i;j<=n-1;j++){
//                if(arr[j]<arr[min]){
//                    min=j;
//
//                }
//            }
//            int temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;
//        }
//    }
//}

public class A1SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 32, 20, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n= arr.length;
        for (int i = 0; i <= n-2; i++) {
            int min = i;
            for (int j = i; j <= n-1 ; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


}