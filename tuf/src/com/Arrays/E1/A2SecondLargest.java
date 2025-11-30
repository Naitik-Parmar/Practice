package com.Arrays.E1;

import java.util.Arrays;

public class A2SecondLargest {
    public static void main(String[] args) {
//        int[] arr = {1,4,5,2,3};
        int[] arr = {7,8,7,7,7,7,7,7};
        // Brute-Force ->O(nlogn+n)
//        Arrays.sort(arr);
//        int largest=arr[arr.length-1];
//        int slargest=-1;
//        for(int i= arr.length-2;i>=0;i--){
//            if(arr[i]!=largest){
//                slargest=arr[i];
//                break;
//            }
//        }
//        System.out.println(slargest);




        // Better -> O(2n)
//        System.out.println(secondLargest(arr));

        // Optimal -> O(n)
        System.out.println(secondLarg(arr));
    }

    private static int secondLarg(int[] arr) {
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }
        }
        return slargest;
    }

//    private static int secondLargest(int[] arr) {
//        int largest=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>largest){
//                largest=arr[i];
//            }
//        }
//        int slargest=-1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>slargest && arr[i]!=largest){
//                slargest=arr[i];
//            }
//        }
//        return slargest;
//    }
}
