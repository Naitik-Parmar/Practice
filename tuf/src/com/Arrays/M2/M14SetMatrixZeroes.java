package com.Arrays.M2;

import java.util.Arrays;

public class M14SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 1, 1}
        };
        int n=matrix.length;
        System.out.println(n);
        int m=matrix[0].length;
        System.out.println(m);
        zeroMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
        for(int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    // Optimal Approach
    // Tc = O(n^2)
    // Sc = O(1)
    private static void zeroMatrix(int[][] matrix) {
        boolean firstRow = false, firstCol = false;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0){
                    if(i==0) firstRow=true;
                    if (j==0) firstCol=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstRow){
            for (int i = 0; i < m; i++) {
                matrix[0][i]=0;
            }
        }
        if(firstCol){
            for (int j = 0; j < n; j++) {
                matrix[j][0]=0;
            }
        }
    }

    // Better Approach
    // Tc = O(2*(n*m))
    // Sc = O(n) + O(m)
//    private static void zeroMatrix(int[][] matrix) {
//        int n = matrix.length;
//        int m = matrix[0].length;
//        int[] row = new int[n];
//        int[] col = new int[m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(matrix[i][j]==0){
//                    row[i]=1;
//                    col[j]=1;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(row[i]==1 || col[j]==1){
//                    matrix[i][j]=0;
//                }
//            }
//        }
//    }


    // Brute Force
    // Tc = O(n^3)
    // Sc = O(1)
//    private static void zeroMatrix(int[][] matrix) {
//        int n=matrix.length;
//        int m=matrix[0].length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(matrix[i][j]==0){
//                    for (int k = 0; k < m; k++) {
//                        if(matrix[i][k]!=0){
//                            matrix[i][k]=-1;
//                        }
//                    }
//                    for (int k = 0; k < n; k++) {
//                        if(matrix[k][j]!=0){
//                            matrix[k][j]=-1;
//                        }
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(matrix[i][j]==-1){
//                    matrix[i][j]=0;
//                }
//            }
//        }
//    }

    /*
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    for(int k=0;k<m;k++){
                        if(matrix.get(i).get(k)!=0){
                            matrix.get(i).set(k,-1);
                        }
                    }
                    for(int k=0;k<n;k++){
                        if(matrix.get(k).get(j)!=0){
                            matrix.get(k).set(j,-1);
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
     */
}
