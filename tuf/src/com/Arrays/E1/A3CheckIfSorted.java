package com.Arrays.E1;


import java.util.Arrays;

public class A3CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 4 ,5};
        System.out.println(ifSorted(arr));
    }

    private static boolean ifSorted(int[] arr) {
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]<=arr[i+1]){

            }
            else{
                return false;
            }
        }
        return true;
    }


}
