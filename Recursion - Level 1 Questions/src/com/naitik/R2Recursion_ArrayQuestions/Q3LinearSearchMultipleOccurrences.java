package com.naitik.R2Recursion_ArrayQuestions;

import java.util.ArrayList;

public class Q3LinearSearchMultipleOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,8,9};
        int target = 6;
        findAllIndex(arr,target,0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    private static void findAllIndex(int[] arr, int target, int index) {
        if(arr.length-1 == index){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
}
