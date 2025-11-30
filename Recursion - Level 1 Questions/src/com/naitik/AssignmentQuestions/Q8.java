package com.naitik.AssignmentQuestions;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            if(n%3==0)
                System.out.println(a);
            else if(n%3==1)
                System.out.println(b);
            else
                System.out.println(a^b);
        }
    }
}
/*
4
86 77 15
93 35 86
92 49 21
62 27 90
 */