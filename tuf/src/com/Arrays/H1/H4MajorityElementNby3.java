package com.Arrays.H1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class H4MajorityElementNby3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 3, 2, 2, 2};
        List<Integer> ans = majorityElementNBy3(arr);
        System.out.println(ans);
    }

    // Optimal Approach
    // Tc = O(n)
    // Sc = O(1)
    private static List<Integer> majorityElementNBy3(int[] arr) {
        int n = arr.length;
        int cnt1=0,cnt2=0;
        int el1=0,el2=0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(cnt1==0 && arr[i]!=el2){
                cnt1++;
                el1=arr[i];
            }
            else if(cnt2==0 && arr[i]!=el1){
                cnt2++;
                el2=arr[i];
            }
            else if(el1==arr[i]){
                cnt1++;
            }
            else if(el2==arr[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        int mm = (int)(n/3)+1;
        for (int i = 0; i < n; i++) {
            if(el1==arr[i])cnt1++;
            if(el2==arr[i])cnt2++;
        }
        if(cnt1>=mm)ans.add(el1);
        if(cnt2>=mm)ans.add(el2);

        return ans;
    }

    // Better Approach
    // Tc = O(nlogn)
    // Tc = O(n)
//    private static List<Integer> majorityElementNBy3(int[] arr) {
//        int n = arr.length;
//        ArrayList<Integer> ans = new ArrayList<>();
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int mm = (n/3)+1;
//        for (int i = 0; i < n; i++) {
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//            if(mm==map.get(arr[i])){
//                ans.add(arr[i]);
//            }
//            if(ans.size()==2)break;
//        }
//        return ans;
//    }


    // Better Approach
    // Tc = O(nlogn) + O(n)
    // Tc = O(n)
//    private static List<Integer> majorityElementNBy3(int[] arr) {
//        int n = arr.length;
//        ArrayList<Integer> ans = new ArrayList<>();
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<n;i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        for(Map.Entry<Integer,Integer> it : map.entrySet()){
//            if(it.getValue()>n/3){
//                ans.add(it.getKey());
//            }
//            if(ans.size()==2)break;
//        }
//        return ans;
//    }

    // Brute Approach
    // Tc = O(n^2)
    // Sc = O(2)
//    private static List<Integer> majorityElementNBy3(int[] arr) {
//        int n = arr.length;
//        List<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            if(ans.size()==0 || !ans.contains(arr[i])){  // od if(!ls.contains(arr[i]))
//                int cnt = 0;
//                for (int j = 0; j < n; j++) {
//                    if(arr[i]==arr[j]){
//                        cnt++;
//                    }
//                }
//                if(cnt>n/3){
//                    ans.add(arr[i]);
//                }
//            }
//            if(ans.size()==2){
//                break;
//            }
//        }
//        return ans;
//    }
}
