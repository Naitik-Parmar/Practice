package com.cyclesort;

// https://leetcode.com/problems/find-the-duplicate-number/

public class Q3FindTheDuplicateNumber287 {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr){
        int i=0;
        while(i<arr.length) {
            if (arr[i] != i + 1) {
                int current = arr[i] - 1;
                if (arr[current] != arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[current];
                    arr[current] = temp;
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
