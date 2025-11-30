package com.Arrays.E3;

public class E13FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
//        int n= arr.length;

        // Brute Force
        // Tc = O(n^2)
        // Sc = O(1)
//        for (int i = 1; i <=n ; i++) {
//            int flag=0;
//            for (int j = 0; j <n; j++) {
//                if(arr[j]==i){
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0){
//                System.out.println(i);
//            }
//        }

        // Better Approach
        // Tc = O(n)+O(n) -> O(2n)
        // Sc = O(n)
        int n= arr.length;
        int[] hash = new int[n+1];
        for (int i = 0; i < n-1; i++) {
            hash[arr[i]]=1;
        }
        for (int i = 1; i <=n ; i++) {
            if(hash[i]==0){
                System.out.println(i);
            }
        }


        // Optimal Approach
        // Tc = O(n)
        // Sc = O(1)
//        int n= arr.length+1;
//        int s1=n*(n+1)/2;
//        int s2=0;
//        for (int i = 0; i < arr.length; i++) {
//            s2=s2+arr[i];
//        }
//        System.out.println(s1-s2);

        // Optimal Approach
        // Tc = O(n)
        // Sc = O(1)
//        int xor1=0,xor2=0;
//        for (int i = 0; i < arr.length; i++) {
//            xor2=xor2^arr[i];
//            xor1=xor1^(i+1);
//        }
//        xor1=xor1^arr[arr.length-1];
//        System.out.println(xor1^xor2);
    }
}
