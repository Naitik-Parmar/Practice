package com.naitik.AssignmentQuestions;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
//        String s = "mad";
//        reverse(s);
        char[] s = {'h','a','n','n','a','H'};
        reverses(s);
        System.out.println(Arrays.toString(s));

    }
    static void reverses(char[] s){
        helper(s,0,s.length-1);
    }

    private static void helper(char[] s, int i, int j) {
        if(i>=j){
            return;
        }
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        helper(s,i+1,j-1);
    }
//    static void reverse(String s){
//        if(s.isEmpty()){
//            return;
//        }
//        System.out.print(s.charAt(s.length()-1));
//        reverse(s.substring(0,s.length()-1));
//    }
}
