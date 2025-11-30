package com.Arrays.M1;

import java.util.ArrayList;
import java.util.Arrays;

public class M2SortArray0s1s2s {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
//        sortArr(arr);
//        System.out.println(arr);

        int[] arr = {0,2,1,2,0,1};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Optimal Approach
    // Tc = O(n)
    // Sc = O(1)

    private static void sortArray(int[] arr) {
        int low=0,mid=0,high= arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swapArr(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swapArr(arr,mid,high);
                high--;
            }
        }

    }

    private static void swapArr(int[] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    // Better Approach
    // Tc = O(n)+O(n) => O(2n)
    // Sc = O(1)
//    private static void sortArr(ArrayList<Integer> arr) {
//        int c0=0,c1=0,c2=0;
//        for (int i = 0; i < arr.size(); i++) {
//            if(arr.get(i)==0){
//                c0++;
//            } else if (arr.get(i)==1) {
//                c1++;
//            }else{
//                c2++;
//            }
//        }
//        for (int i = 0; i < c0; i++) {
//            arr.set(i,0);
//        }
//        for(int i=c0;i<c0+c1;i++){
//            arr.set(i,1);
//        }
//        for(int i=c0+c1;i<arr.size();i++){
//            arr.set(i,2);
//        }
//    }
}
