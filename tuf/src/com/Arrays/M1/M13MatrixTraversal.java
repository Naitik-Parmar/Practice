package com.Arrays.M1;

public class M13MatrixTraversal {
    public static void main(String[] args) {
        int[][] arr = {{2,4,2,1},{1,3,5,2,3}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
