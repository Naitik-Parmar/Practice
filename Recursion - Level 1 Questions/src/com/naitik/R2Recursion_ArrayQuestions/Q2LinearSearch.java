package com.naitik.R2Recursion_ArrayQuestions;

public class Q2LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,7,12};
        int target=7;
        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        System.out.println(findIndexFromLast(arr,target,arr.length-1));
    }

    private static boolean find(int[] arr, int target, int index) {
        if(index==arr.length-1)
            return false;
        return arr[index]==target || find(arr,target,index+1);
    }
    private static int findIndex(int[] arr, int target, int index) {
        if(index==arr.length-1)
            return -1;
        if(arr[index]==target)
            return index;
        else
            return findIndex(arr,target,index+1);
    }
    private static int findIndexFromLast(int[] arr, int target, int index) {
        if(index==-1)
            return -1;
        if(arr[index]==target)
            return index;
        else
            return findIndex(arr,target,index-1);
    }
}
