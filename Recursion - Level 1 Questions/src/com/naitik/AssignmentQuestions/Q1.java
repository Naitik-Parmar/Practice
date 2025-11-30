package com.naitik.AssignmentQuestions;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        print(arr);

        print(arr,0);
    }

//    static void print(int[] arr){
//        if(arr.length==1){
//            System.out.println(Arrays.toString(arr));
//            return;
//        }
//        int[] temp = new int[arr.length-1];
//        for(int i=0;i< arr.length-1;i++){
//            temp[i] = arr[i]+arr[i+1];
//        }
//        System.out.println(Arrays.toString(arr));
//        print(temp);
//    }
//    static void print(int[] arr){
//        if(arr.length==1){
//            System.out.println(Arrays.toString(arr));
//            return;
//        }
//        int[] temp = new int[arr.length-1];
//        for (int i = 0; i < arr.length-1; i++) {
//            temp[i]=arr[i]+arr[i+1];
//        }
//        System.out.println(Arrays.toString(arr));
//        print(temp);
//    }

//    static void print(int[] arr, int index){
//        if(index==arr.length){
//            System.out.println(']');
//            return;
//        }
//        if(index==0){
//            System.out.print('[');
//        }
//        System.out.print(arr[index]);
//        if(index< arr.length-1){
//            System.out.print(", ");
//        }
//        print(arr,index+1);
//    }

    static void print(int[] arr, int index){
        if(index== arr.length){
            System.out.println("]");
            return;
        }
        if(index==0){
            System.out.print('[');
        }
        System.out.print(arr[index]);
        if(index< arr.length-1){
            System.out.print(", ");
        }
        print(arr,index+1);
    }

//    static void print(int[] arr, int index){
//        if(index > arr.length){
//            return;
//        }
//        System.out.println(Arrays.toString(Arrays.copyOf(arr,index)));
//       print(arr,index+1);
//    }
}
