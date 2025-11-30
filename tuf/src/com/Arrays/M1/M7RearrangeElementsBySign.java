package com.Arrays.M1;

import java.util.Arrays;

public class M7RearrangeElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(i<j && arr[i]>0){
                i++;
            }
            while(i<j && arr[j]<0){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
