package com.A2Sorting;

import java.util.Arrays;

public class A3InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n=arr.length;
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int n) {
        for(int i=1;i<=n-1;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}
