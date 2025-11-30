package com.Arrays.E2;

public class A9LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,2,6,8};
        int ele=9;
        System.out.println(ls(arr,ele));
    }

    private static int ls(int[] arr,int ele) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
}
