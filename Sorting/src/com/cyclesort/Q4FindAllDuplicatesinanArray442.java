package com.cyclesort;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class Q4FindAllDuplicatesinanArray442 {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        List<Integer> ans=new ArrayList<>();

        while(i<arr.length){
            int current=arr[i]-1;
            if(arr[i]!=arr[current]){
                int temp=arr[i];
                arr[i]=arr[current];
                arr[current]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}
