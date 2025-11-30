package com.naitik.R4_Strings;

public class Q2SkipString {
    public static void main(String[] args) {
        String s="ApPleadjds";
        s=s.toLowerCase();
        System.out.println(skipString("bdapplefg"));
        System.out.println(skipString(s));
    }

    static String skipString(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipString(s.substring(5));
        }
        else{
            return s.charAt(0)+skipString(s.substring(1));
        }
    }
}
