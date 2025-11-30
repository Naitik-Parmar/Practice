package com.patterns;

public class P28Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n){
        for (int row = 1; row <= 2*n-1 ; row++) {
            int totalColInRow = row>n?2*n-1-row+1:row;
            int totalSpaces = n-totalColInRow;

            for (int s = 1; s <= totalSpaces ; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
