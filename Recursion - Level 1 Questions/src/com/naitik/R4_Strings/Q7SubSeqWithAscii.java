package com.naitik.R4_Strings;

public class Q7SubSeqWithAscii {
    public static void main(String[] args) {
        subSeqAscii("","abc");
    }
    static void subSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subSeqAscii(p+ch,up.substring(1));
        subSeqAscii(p+(ch+0),up.substring(1));
        subSeqAscii(p,up.substring(1));
    }
}
