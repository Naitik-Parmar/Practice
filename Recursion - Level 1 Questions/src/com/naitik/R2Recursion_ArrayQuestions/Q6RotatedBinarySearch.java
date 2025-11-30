package com.naitik.R2Recursion_ArrayQuestions;

public class Q6RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target =3;
        System.out.println(RBS(arr,target,0,arr.length-1));
    }

    private static int RBS(int[] arr, int target, int s, int e) {
        int m = s + (e-s)/2;
        if(s>e){
            return -1;
        }
        if(arr[m]==target)
            return m;
        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return RBS(arr,target,s,m-1);
            }
            else{
                return RBS(arr,target,m+1,e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return RBS(arr,target,m+1,e);
        }
        return RBS(arr,target,s,m-1);
    }
}
