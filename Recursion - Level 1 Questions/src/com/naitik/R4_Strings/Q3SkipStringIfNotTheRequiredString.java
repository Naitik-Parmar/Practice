package com.naitik.R4_Strings;

public class Q3SkipStringIfNotTheRequiredString {
    public static void main(String[] args) {
//        System.out.println(skipAppNotApple("bacappnotapplenaitik"));
        System.out.println(skipAppNotApple("bacappnotpplenaitik"));
    }
    static String skipAppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppNotApple(s.substring(3));
        }
        else{
            return s.charAt(0)+skipAppNotApple(s.substring(1));
        }
    }
}
