package BitManipulation;

/*
    n = 13
    convert to binary i.e. (1101) and then do for given i check the bit is set or not
    for i=2 bit is set as 101 i.e. see from last and for i=1 bit is not set 01
*/

import java.util.Scanner;

public class Q04CheckIfTheithBitIsSetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n = sc.nextInt();
//        System.out.println(convertDecimalIntoBinary(n));

//        int num = Integer.parseInt(convertDecimalIntoBinary(n));

        System.out.println("Enter ith bit to check if set or not : ");
        int i = sc.nextInt();

        System.out.println(checkTheithBit(n,i));


        // Tc and Sc for both the approaches is O(1)
        // Using left shift
//        if((num&(1<<i))!=0){
//            System.out.println("Bit is Set : 1");
//        }
//        else{
//            System.out.println("Bit Not Set : 0");
//        }

        // Using right shift
//        if(((num>>i)&1)!=0){
//            System.out.println("Bit is Set : 1");
//        }
//        else{
//            System.out.println("Bit Not Set : 0");
//        }
    }
    private static int checkTheithBit(int n, int i){
        return (n&(1<<i))!=0?1:0;
    }
//    private static String convertDecimalIntoBinary(int n){
//        String res = "";
//        while(n!=0){
//            if(n%2==1){
//                res+="1";
//            }
//            else{
//                res+="0";
//            }
//            n/=2;
//        }
//        String rev = "";
//        for(int i=res.length()-1;i>=0;i--){
//            rev = rev + res.charAt(i);
//        }
//        return rev;
//    }

}
