package com.naitik.R5_Permutations;

public class Q3CountOfPermutation {
    public static void main(String[] args) {
        System.out.println(permutation("","abcd"));
        System.out.println(permutation1("","abc",0));
    }
    static int permutation(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count =  count + permutation(f+ch+s,up.substring(1));
        }
        return count;
    }static int permutation1(String p, String up, int count){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count =  count + permutation1(f+ch+s,up.substring(1),0);
        }
        return count;
    }
}
