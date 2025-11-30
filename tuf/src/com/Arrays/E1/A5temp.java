package com.Arrays.E1;

import java.util.Arrays;

public class A5temp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 ,5, 6}; // 6 1 2 3 4 5 ->right // left-> 2 3 4 5 6 1
//        int[] res = (rightRotateBy1(arr));
//        System.out.println(Arrays.toString(res));
//        int[] ans = (leftRotateBy1(arr));
//        System.out.println(Arrays.toString(ans));
//
        int[] answer = (rotateLeftByd(arr,2)); // 3 4 5 6 1 2
        System.out.println(Arrays.toString(answer));
    }

    private static int[] rotateLeftByd(int[] arr, int k) {
        int n= arr.length;
        int d = k%n;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
        return arr;
    }

    private static void reverseArray(int[] arr,int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Brute Force
    // Tc = O(n+d)
    // Sc = O(d)
//    public static int[] rotateLeftByd(int[] arr, int k) {
//        int n=arr.length;
//        int d = k%n;
//        int[] temp = new int[n];
//        for (int i = 0; i < d; i++) {
//            temp[i]=arr[i];
//        }
//        for(int i=d;i<n;i++){
//            arr[i-d]=arr[i];
//        }
//        for(int i=0;i<d;i++){
//            arr[n-d+i]=temp[i];
//        }
//        return arr;
//    }
    private static int[] leftRotateBy1(int[] arr) {
        int e = arr[0];
        for(int i=1;i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=e;
        return arr;
    }

    private static int[] rightRotateBy1(int[] arr) {
        int e = arr[arr.length-1];
        for(int i= arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=e;
        return arr;
    }
}
