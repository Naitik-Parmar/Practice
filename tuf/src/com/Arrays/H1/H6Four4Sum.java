package com.Arrays.H1;

import java.util.*;

public class H6Four4Sum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;

        List<List<Integer>> ans = fourSum(arr,target);
        for(List<Integer> sublist:ans){
            for(int num : sublist){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    // Optimal Approach
    // Tc = O(n^3)
    // Sc = O(no. of quadruplets), This space is only used to store the answer. We are not using any extra space
    // to solve this problem. So, from that perspective, space complexity can be written as O(1).
    private static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(i!=0 && arr[i]==arr[i-1])continue;;
            for (int j = i+1; j <n ; j++) {
                if(j!=i+1 && arr[j]==arr[j-1])continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum = arr[i]+arr[j];
                    sum += arr[k]+arr[l];
                    if(sum>target){
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1])k++;
                        while(k<l && arr[l]==arr[l+1])l--;
                    }
                }
            }
        }
        return ans;
    }

    // Better Approach
    // Tc = O(n^3*log(m))
    // Sc = O(2 * no. of the quadruplets)+O(N)
//    private static List<List<Integer>> fourSum(int[] arr, int target) {
//        Set<List<Integer>> set = new HashSet<>();
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                Set<Integer> hashset = new HashSet<>();
//                for (int k = j+1; k < n; k++) {
//                    int fourth = target-(arr[i]+arr[j]+arr[k]);
//                    if(hashset.contains(fourth)){
//                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],fourth);
//                        temp.sort(null);
//                        set.add(temp);
//                    }
//                    hashset.add(arr[k]);
//                }
//            }
//        }
//        return new ArrayList<>(set);
//    }

    // Brute Force
    // Tc = O(n^4)
    // Sc = O(2 * no. of the quadruplets) as we are using a set data structure and a list to store the quads.
//    private static List<List<Integer>> fourSum(int[] arr, int target) {
//        int n = arr.length;
//        Set<List<Integer>> set = new HashSet<>();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                for (int k = j+1; k < n; k++) {
//                    for (int l = k+1; l < n; l++) {
//                        long sum = arr[i]+arr[j];
//                        sum += arr[k]+arr[l];
//                        if(sum==target){
//                            List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
//                            temp.sort(null);
//                            set.add(temp);
//                        }
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(set);
//    }
}
