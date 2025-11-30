package com.test;

public class A1BubbleSortTest {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,7,5,1,5,7,9,8,4,3,5};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void bubbleSort(int[] arr){
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }
            }
            if(!flag)break;
        }
    }
}
