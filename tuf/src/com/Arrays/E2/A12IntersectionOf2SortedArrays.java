package com.Arrays.E2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class A12IntersectionOf2SortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,2,3,3,3,4,6};
        int[] arr2={1,2,2,3,4,7};

        int m=arr1.length;
        int n= arr2.length;
        ArrayList<Integer> ans=inter(arr1,arr2,m,n);
        System.out.println(ans);

        // Brute Force
        // Tc = O(n1*n2)
        // Sc = O(n2)

//        ArrayList<Integer> ans = new ArrayList<>();
//        int[] v = new int[arr2.length];
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if(arr1[i]==arr2[j] && v[j]==0){
//                    ans.add(arr2[j]);
//                    v[j]=1;
//                }
//                if(arr2[j]>arr1[i]){
//                    break;
//                }
//            }
//        }
//        System.out.println(ans);

    }

    // Optimal Approach
    // Tc= O(n1+n2)
    // Sc= O(1) or O(n1+n2) in worst case
    private static ArrayList<Integer> inter(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                i++;
            } else if (arr2[j]<arr1[i]) {
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
