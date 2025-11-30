package com.Arrays.E2;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class A10UnionOf2SortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,2,3,3,3,4,6};
        int[] arr2={1,2,3,4,7};
        int m= arr1.length;
        int n=arr2.length;
        ArrayList<Integer> union=unions(arr1,arr2,m,n);
        for(int e:union){
            System.out.print(e+" ");
        }
        System.out.println();
//        int[] res = {arr1.length+ arr2.length};

        // Brute Force
        // Tc = O(n1logn + n2logn) + O(n1+n2)
        // Sc = O(n1+n2) + O(n1+n2)-to print or display
//        Set<Integer> res = new TreeSet<>();
//        for(int e:arr1){
//            res.add(e);
//        }
//        for(int e:arr2){
//            res.add(e);
//        }
//        System.out.println(res);

        /*
        Set<Integer> set = new TreeSet<>();
        for(int e:arr1){
            set.add(e);
        }
        for(int e:arr2){
            set.add(e);
        }
        return new ArrayList<>(set);
         */
    }

    // Optimal Approach
    // Tc = O(n1+n2)
    // Sc = O(n1+n2)->to return or display
    private static ArrayList<Integer> unions(int[] arr1, int[] arr2, int m, int n) {
        int i=0,j=0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<m){
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
        }
        while(j<n){
            if(union.size()==0 || union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
}
