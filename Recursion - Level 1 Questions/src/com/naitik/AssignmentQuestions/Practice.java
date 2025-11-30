package com.naitik.AssignmentQuestions;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no. : ");
//        int n = sc.nextInt();
//
//        int cnt = sumOfDigits(n);
//        System.out.println(cnt);

        System.out.println("Enter string : ");
        String str = sc.nextLine();
//        skip("",str);


        System.out.println(skip(str));
    }
    private static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            return skip(str.substring(1));
        }
        else {
            return ch + skip(str.substring(1));
        }
    }

}
