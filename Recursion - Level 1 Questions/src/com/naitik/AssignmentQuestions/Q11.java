package com.naitik.AssignmentQuestions;

import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr,4,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int r, int c){
        if(r==0)
            return;
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp= arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);
        }
        else{
           bubble(arr,r-1,0);
        }
    }
}
