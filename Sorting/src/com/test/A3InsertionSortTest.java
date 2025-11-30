package com.test;

import java.util.Arrays;

public class A3InsertionSortTest {
    public static void main(String[] args) {
        int[] arr={5,4,1,2,3,7,4,1,2,3,4,-34,43-12};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }

        }
    }
}
