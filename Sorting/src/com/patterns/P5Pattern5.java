package com.patterns;

public class P5Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            int totalCol=row>n?2*n-1-row+1:row;
            for (int col = 1; col <= totalCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
