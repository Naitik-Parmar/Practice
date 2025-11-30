package com.naitik.AssignmentQuestions;

public class Q9 {
    public static void main(String[] args) {
        System.out.println(length("GEEKSFORGEEKS"));
    }
    static int length(String s){
        if(s.isEmpty())
            return 0;
        return 1+length(s.substring(1));
    }
}
