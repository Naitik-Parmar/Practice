package com.Arrays.M1;

import java.util.ArrayList;
import java.util.Arrays;

public class M9SeparatePosNegInArrayNotEqual {
    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5, -3, -4};
        posNeg(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Optimal Approach
    // Tc = O(n) + O(min(pos,neg))+O(leftovers) => O(n)+(n)=> O(2n)
    // Sc = O(n)
    private static void posNeg(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }
        if(pos.size()>neg.size()){
            for (int i = 0; i < neg.size(); i++) {
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            int index=neg.size()*2;
            for (int i = neg.size(); i <pos.size() ; i++) {
                arr[index]=pos.get(i);
                index++;
            }
        }
        else{
            for (int i = 0; i < pos.size(); i++) {
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            int index=pos.size()*2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index]=neg.get(i);
                index++;
            }
        }
    }
}
