package com.Arrays.E3;

public class E14MaximumConsecutive1s {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,2,3,1,1};
        int ans=ms1(arr);
        System.out.println(ans);
    }

    private static int ms1(int[] arr) {
        int maxi=0,cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                cnt+=1;
                maxi=Math.max(maxi,cnt);
            }
            else{
                cnt=0;
            }
        }
        return maxi;
    }
}
