package com.naitik.R3_Recursion_PatternQuestions_BubbleSort_SelectionSort;

import java.util.Arrays;

public class Q4SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 25, 8, 3, 11, 9, 12, 0, -1, 3};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr, int r, int c, int max) {
        if(r==0)
            return;
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr,r,c+1,c);
            }
            else{
                selection(arr,r,c+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr,r-1,0,0);
        }
    }
}
