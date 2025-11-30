package com.Arrays.E2;

import java.util.Arrays;

public class A5LeftRotateArrayBy1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        lr(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Optimal
    // TC - O(n) , SC - extraspace - O(1) nd space - O(n)
    private static void lr(int[] arr) {
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
}
