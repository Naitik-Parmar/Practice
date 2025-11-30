package com.Arrays.M1;

import java.util.Arrays;
import java.util.HashSet;

public class M12LongestConsecutiveSequenceInAnArray {
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 2, 3, 4};
        int ans = lsC(arr);
        System.out.println(ans);
    }

    // Better Approach
    // Tc = O(nlogn)+O(n)
    // Sc = O(1)
    private static int lsC(int[] arr) {
        Arrays.sort(arr);
        int longest = 1;
        int curCnt = 0;
        int lastSmaller = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(lastSmaller==arr[i]-1){
                curCnt+=1;
                lastSmaller=arr[i];
            }
            else if(lastSmaller!=arr[i]){
                curCnt=1;
                lastSmaller=arr[i];
            }
            longest = Math.max(longest,curCnt);
        }
        return longest;
    }

    // Brute Force
    // Tc = O(n^2)
    // Sc = O(1)
//    private static int lsC(int[] arr) {
//        int longest = 1;
//        int cnt = 0;
//        int x=0;
//        for (int i = 0; i < arr.length; i++) {
//            x=arr[i];
//            cnt=1;
//            while(linearSearch(arr,x+1)){
//                cnt+=1;
//                x=x+1;
//            }
//            longest = Math.max(longest,cnt);
//        }
//        return longest;
//    }
//
//    private static boolean linearSearch(int[] arr, int i) {
//        for (int j = 0; j < arr.length; j++) {
//            if(arr[j]==i){
//                return true;
//            }
//        }
//        return false;
//    }

    // Optimal Approcah
    // Tc = O(3n)
    // Sc = O(3n)
//    private static int lsC(int[] arr) {
//        int longest = 1;
//        HashSet<Integer> set = new HashSet<>();
//        for (int j : arr) {
//            set.add(j);
//        }
//        int c=0,x=0;
//        for(int it:set){
//            if(!set.contains(it-1)){
//                x=it;
//                c=1;
//            }
//            while(set.contains(x+1)){
//                c=c+1;
//                x=x+1;
//            }
//            longest= Math.max(longest,c);
//        }
//
//        return longest;
//    }
}
