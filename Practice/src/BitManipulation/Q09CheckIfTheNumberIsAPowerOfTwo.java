package BitManipulation;

import java.util.Scanner;

/*
     n = 16 i.e. { 1 0 0 0 } which contains only 1 set bit , that's why it is power of 2
     n = 13 i.e. { 1 1 0 1 } which contains 3 set bits, that's why it is not power of 2
     n = 32 i.e. { 1 0 0 0 0 } which contains only 1 set bit, that's why it is power of 2

     first approach is brute force convert the no. to binary and check it only contains 1 set bit
*/
public class Q09CheckIfTheNumberIsAPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to check if it is a power of 2 : ");
        int n = sc.nextInt();

        boolean res = checkIfANumberIsAPowerOf2(n);
        if(res){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }

    // Brute Force
    // Tc = O(log2n)
    // Sc = O(log2n)
//    private static boolean checkIfANumberIsAPowerOf2(int n){
//        int num = Integer.parseInt(convertDecimalIntoBinary(n));
//        int cnt = 0;
//        while(num!=0){
//            int lastDigit = num%10;
//            if(lastDigit==1) {
//                cnt++;
//            }
//            num/=10;
//        }
//        return cnt==1;
//    }
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
//            rev = rev+res.charAt(i);
//        }
//        return res;
//    }


    private static boolean checkIfANumberIsAPowerOf2(int n){

        return (n&(n-1))==0;
    }
}
