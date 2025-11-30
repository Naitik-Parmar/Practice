package BitManipulation;

import java.util.Scanner;

public class Q01ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
//        int n = sc.nextInt();

        String x = sc.next();
        System.out.println(convertDecimalToBinary(x));
    }

    private static String convertDecimalToBinary(String x){
        String res = "";
        int n = Integer.parseInt(x);
        while(n!=0){
            if(n%2==1){
                res+="1";
            }
            else{
                res+="0";
            }
            n/=2;
        }
        String rev = "";
        for(int i=res.length()-1;i>=0;i--){
            rev=rev+res.charAt(i);
        }
        return rev;
    }

    // Tc = O(log2n)
    // Sc = O(log2n)
//    private static String convertDecimalToBinary(int n){
//
//        String res="";
//        while(n>0){
//            if(n%2==1){
//                res+="1";
//            }
//            else {
//                res+="0";
//            }
//            n/=2;
//        }
//        String rev = "";
//        for(int i=res.length()-1;i>=0;i--){
//            rev=rev+res.charAt(i);
//        }
//        return rev;
//    }
}
