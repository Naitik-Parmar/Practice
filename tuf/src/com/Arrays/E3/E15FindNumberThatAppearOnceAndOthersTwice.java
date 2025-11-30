package com.Arrays.E3;

public class E15FindNumberThatAppearOnceAndOthersTwice {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5,5};
//        int ans = fn1(arr);
//        System.out.println(ans);

        int ans=fn1s(arr);
        System.out.println(ans);
    }

    // Optimal Approach
    // Tc = O(n)
    // Sc = O(1)
    private static int fn1s(int[] arr) {
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor^=arr[i];
        }
        return xor;
    }

    // Brute Force
    // Tc = O(n^2)
    // Sc = O(1)
    private static int fn1(int[] arr) {
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int cnt=0,num=arr[i];
            for (int j = 0; j < n; j++) {
                if(arr[j]==num){
                    cnt++;
                }
            }
            if(cnt==1){
                return arr[i];
            }
        }
        return -1;
    }

}
