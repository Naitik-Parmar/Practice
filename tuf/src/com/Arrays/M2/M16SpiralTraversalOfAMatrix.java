package com.Arrays.M2;

public class M16SpiralTraversalOfAMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println("Spiral Traversal of the Matrix:");
        spiral(matrix);
    }

    // Optimal Approach
    // Tc = O(n*m)
    // Sc = O(1)
    private static void spiral(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int colBegin = 0, colEnd = m - 1;
        int rowBegin = 0, rowEnd = n - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse from left to right
            for (int j = colBegin; j <= colEnd; j++) {
                System.out.print(matrix[rowBegin][j] + " ");
            }
            rowBegin++;
            System.out.println();

            // Traverse from top to bottom
            for (int j = rowBegin; j <= rowEnd; j++) {
                System.out.print(matrix[j][colEnd] + " ");
            }
            colEnd--;
            System.out.println();

            // Traverse from right to left
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    System.out.print(matrix[rowEnd][j] + " ");
                }
                rowEnd--;
                System.out.println();
            }

            // Traverse from bottom to top
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    System.out.print(matrix[j][colBegin] + " ");
                }
                colBegin++;
                System.out.println();
            }
        }
    }
}
