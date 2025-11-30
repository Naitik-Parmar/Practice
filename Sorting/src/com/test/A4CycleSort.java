package com.test;

import java.util.Arrays;

public class A4CycleSort {
    public static void main(String[] args) {
        int[] arr={7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int [] arr){
        int i=0;
        while(i< arr.length){
            int current=arr[i]-1;
            if(arr[i]!=arr[current]){
                int temp=arr[i];
                arr[i]=arr[current];
                arr[current]=temp;
            }
            else{
                i++;
            }

        }
    }
}
