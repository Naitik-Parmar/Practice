package com.Arrays.E2;

import java.util.Arrays;

public class A11Merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,3,4,7,8};
        int[] arr2={2,3,4,4,5,6,7};
        int[] res=new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            res[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            res[arr1.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
