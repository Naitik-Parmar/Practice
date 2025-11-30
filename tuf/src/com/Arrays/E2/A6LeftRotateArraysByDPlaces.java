package com.Arrays.E2;

import java.util.Arrays;

public class A6LeftRotateArraysByDPlaces {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7};
        int d=3;
//        lrd(arr,d);
//        System.out.println(Arrays.toString(arr));

        lrbyd(arr,d);
        System.out.println(Arrays.toString(arr));
    }

    private static void lrbyd(int[] arr, int d) {
        int n= arr.length;
        d=d%n;
        revers(arr,0,d-1);
        revers(arr,d,n-1);
        revers(arr,0,n-1);
    }

    private static void revers(int[] arr, int i, int j) {
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    // Brute Force Approach -> TC=O(n+d) , SC=O(d)
    private static void lrd(int[] arr, int d) {
        int n=arr.length;
        d=d%n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
        }
        for (int i = d; i <n ; i++) {
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
    }

    // Optimal Approach -> TC=O(2n) , SC=O(1)



}
