package com.Arrays.E1;

import java.util.Arrays;

public class A1LargestElement {

    public static void main(String[] args) {
        int[] arr = {1,4,5,3,2};
        // Brute-Force -> Tc=(nlogn) , Sc = (n)
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        // Optimal ->(n)
        System.out.println(largest(arr));
        }

    // Optimal Approach
    // Tc = O(n)
    // Sc = O(n)
    private static int largest(int[] arr) {
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}

