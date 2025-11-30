package com.S1;

import java.util.*;

public class S04SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArray(arr)));
    }
    private static int[] sortArray(int[] arr){
        int n = arr.length;
        int low = 0, high = n-1;
        quickSort(arr, low, high);
        return arr;
    }
    private static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot-1);

            quickSort(arr, pivot+1, high);
        }
    }
    private static int partition(int[] arr, int low, int high){
        int pivotIndex = low;
        swapArr(arr, pivotIndex, high);
        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                swapArr(arr, i, j);
            }
        }
        swapArr(arr, i+1, high);
        return i+1;
    }
    private static void swapArr(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
