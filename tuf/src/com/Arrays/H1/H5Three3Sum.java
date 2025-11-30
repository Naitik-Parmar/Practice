package com.Arrays.H1;

import java.util.*;

public class H5Three3Sum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(arr);
        for(List<Integer> sublist:ans){
            for(Integer num:sublist){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    // Optimal Approach
    // Tc = O(NlogN)+O(N2), where N = size of the array.
    // Sc = O(no. of quadruplets), This space is only used to store the answer. We are not using any extra space
    // to solve this problem. So, from that perspective, space complexity can be written as O(1).
    private static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if(i!=0 && arr[i]==arr[i-1])continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1])j++;
                    while(j<k && arr[k]==arr[k+1])k--;
                }
            }
        }
        return ans;
    }

    // Better Approach
    // Tc = O(N2 * log(no. of unique triplets)), where N = size of the array
    // Sc = O(2 * no. of the unique triplets) + O(N) as we are using a set data structure and a list to store the triplets and extra O(N) for storing the array elements in another set
//    private static List<List<Integer>> threeSum(int[] arr) {
//        int n = arr.length;
//        Set<List<Integer>> set = new HashSet<>();
//
//        for (int i = 0; i < n; i++) {
//            Set<Integer> hashset = new HashSet<>();
//            for (int j = i+1; j <n ; j++) {
//                int third = -(arr[i]+arr[j]);
//                if(hashset.contains(third)){
//                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
//                    temp.sort(null);
//                    set.add(temp);
//                }
//                hashset.add(arr[j]);
//            }
//        }
//        return new ArrayList<>(set);
//    }

    // Brute Force
    // Tc = O(N3 * log(no. of unique triplets)), where N = size of the array
    // Sc = O(2 * no. of the unique triplets) as we are using a set data structure and a list to store the triplets
//    private static List<List<Integer>> threeSum(int[] arr) {
//        int n = arr.length;
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                for (int k = j+1; k < n; k++) {
//                    if(arr[i]+arr[j]+arr[k]==0){
//                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
//                        temp.sort(null);
//                        set.add(temp);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(set);
//    }
}
