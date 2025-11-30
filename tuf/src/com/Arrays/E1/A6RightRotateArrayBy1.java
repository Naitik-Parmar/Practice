package com.Arrays.E1;

import java.util.Arrays;

public class A6RightRotateArrayBy1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // 5 1 2 3 4 - R // 2 3 4 5 1 - L
        int[] res = rightRotateBy1Place(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] rightRotateBy1Place(int[] arr) {
        int n = arr.length;

        int e = arr[n-1];
        for(int i=n-1;i>0;i--){
             arr[i]= arr[i-1];
        }
        arr[0]=e;
        return arr;
    }


}
