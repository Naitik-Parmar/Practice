package com.naitik.R4_Strings;

public class Q1SkipCharacter {
    public static void main(String[] args) {
        String s = "baccdah";
        skip("",s);
        System.out.println(skipChar(s));
//        StringBuilder res= new StringBuilder();

//        for (int i = 0; i < s.length(); i++) {
////            if(s.charAt(i)!='a'){
////                res.append(s.charAt(i));
////            }
//            if(s.charAt(i)=='a'){
//                continue;
//            }
//            res.append(s.charAt(i));
//        }
//        System.out.println(res);
    }

    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }

    static String skipChar(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch=='a'){
            return skipChar(s.substring(1));
        }
        else{
            return ch+skipChar(s.substring(1));
        }
    }
}
