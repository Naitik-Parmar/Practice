package com.Arrays.E1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class A4RemoveDuplicatesfromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3};
//        int k=dup(arr);
//        System.out.println(k);
//        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i]+" ");
//        }

        int k=duplicate(arr);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static int duplicate(int[] arr) {
        int i=0;
        for (int j = 1; j < arr.length ; j++) {
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

    // Brute Force - nlogn+O(n)
//    private static int dup(int[] arr) {
//
//        Set<Integer> set = new LinkedHashSet<>();
//        for(int e : arr){
//            set.add(e);
//        }
//        int k= set.size();
//        int j=0;
//        for(int n:set){
//            arr[j++]=n;
//        }
//        return k;
//    }

}
