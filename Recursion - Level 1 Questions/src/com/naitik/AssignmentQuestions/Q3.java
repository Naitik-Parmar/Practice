package com.naitik.AssignmentQuestions;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr,9));
    }
    static int search(int[] arr, int target) {
        int s=0;
        int e= arr.length-1;

        return helper(arr,s,e,target);
    }

    private static int helper(int[] arr, int s, int e, int target) {

        int m=s+(e-s)/2;

        if(arr[m]==target){
            return m;
        }
        else if(target>arr[m]){
            return helper(arr,m+1,e,target);
        }
        else{
            return helper(arr,s,m-1,target);
        }
    }
}
