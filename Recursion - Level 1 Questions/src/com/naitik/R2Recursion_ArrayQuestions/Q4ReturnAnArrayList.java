package com.naitik.R2Recursion_ArrayQuestions;

import java.util.ArrayList;

public class Q4ReturnAnArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,6};
        int target =6;
//        System.out.println(findAllIndex(arr, target, 0, new ArrayList<>()));
        ArrayList<Integer> ans = findAllIndex(arr,target,0,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length-1)
            return list;
        if(arr[index]==target)
            list.add(index);
        return findAllIndex(arr, target, index+1, list);
    }
}
