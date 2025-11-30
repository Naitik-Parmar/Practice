package com.naitik.R2Recursion_ArrayQuestions;

import java.util.ArrayList;

public class Q5ReturnTheListWithoutPassingTheArgument {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,7};
        int target = 7;
        System.out.println(findAllIndexes(arr,target,0));
    }

    private static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index) {
        ArrayList<Integer>  list = new ArrayList<>();


        if(arr[index]==target)
            list.add(index);
        if(index == arr.length-1)
            return list;
        ArrayList<Integer> ans = findAllIndexes(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
