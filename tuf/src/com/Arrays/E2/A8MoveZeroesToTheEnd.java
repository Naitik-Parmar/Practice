package com.Arrays.E2;

import java.util.Arrays;

public class A8MoveZeroesToTheEnd {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,0,5,0,0,6,7};
        int[] arr={8,6,9};
//        mv(arr);
//        System.out.println(Arrays.toString(arr));

        mov(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Optimal Approach
    // Tc = O(x) + O(n-x) => O(n)
    // Sc = O(1)
    private static void mov(int[] arr) {
        int j=-1;
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for (int i=j+1; i <n; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }

    // Brute Force
    // Tc - O(n)+O(x)+O(n-x)=O(2n)
    // Sc - O(n)
//    private static void mv(int[] arr) {
//        int[] temp = new int[arr.length];
//        int j=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]!=0){
//                temp[j++]=arr[i];
//            }
//        }
//        for (int i = 0; i < temp.length; i++) {
//            arr[i]=temp[i];
//        }
//        for (int i = temp.length; i < arr.length; i++) {
//            arr[i]=0;
//        }
//        System.out.println(Arrays.toString(arr));
//    }


}
