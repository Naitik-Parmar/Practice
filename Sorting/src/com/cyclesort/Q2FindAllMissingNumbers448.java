package com.cyclesort;

import java.util.ArrayList;
import java.util.List;


// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
public class Q2FindAllMissingNumbers448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int current=nums[i]-1;
            if(nums[i]!=nums[current]) {
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans =new ArrayList<>();
        for (int j = 0; j < nums.length;j++) {
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
