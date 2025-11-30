package com.Arrays.M2;

import java.util.Arrays;

public class M15RotateMatrixOrImageBy90degree {
    public static void main(String[] args) {
        int[][] matrix = {  {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        rotate90(matrix);
        for(int[] m : matrix){
            System.out.println(Arrays.toString(m));
        }

    }

    // Optimal Approach
    // Tc = O(n*n)+o(n*n) => o(n^2)
    // Sc = O(1)
    private static void rotate90(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n; j++) {
                swapElement(matrix,i,j);
            }
        }
        for (int i = 0; i < n; i++) {
            reverseRow(matrix[i]);
        }
    }

    private static void reverseRow(int[] matrix) {
        int i=0,j=matrix.length-1;
        while(i<=j){
            int temp = matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
        }
    }

    private static void swapElement(int[][] matrix, int i, int j) {
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }


    // Brute Force
    // Tc = O(n^2)
    // Sc = O(n^2)
//    private static void rotate90(int[][] matrix) {
//        int n = matrix.length;
//        int[][] ans = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                ans[j][n-i-1]=matrix[i][j];
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j]=ans[i][j];
//            }
//        }
//    }
}
