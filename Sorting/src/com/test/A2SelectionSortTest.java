package com.test;

import java.util.Arrays;

public class A2SelectionSortTest {
    public static void main(String[] args) {
        int[] arr={5,4,1,2,3,3,4,2,5,6,7,0,-4,67,-34,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last= arr.length-i-1;
            int maxIndex=getMaxIndex(arr, last);

            swap(arr,maxIndex,last);
        }
    }

    static int getMaxIndex(int[] arr, int end) {
        int max= 0;
        for (int i = 0; i <=end ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }

        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
