package com.Arrays.M1;

import java.util.Arrays;

public class M5KadanesAlgoWithMaxSubArrayReturn {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }

    private static int maxSubArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int start=0;
        int ansStart=0,ansEnd=0;

        for (int i = 0; i < arr.length; i++) {
            if(sum==0){
                start=i;
            }
            sum=sum+arr[i];

            if(sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }

            if(sum<0){
                sum=0;
            }
        }
        int[] subArray = Arrays.copyOfRange(arr,ansStart,ansEnd+1);
        System.out.println(Arrays.toString(subArray));
        return max;
    }

}
