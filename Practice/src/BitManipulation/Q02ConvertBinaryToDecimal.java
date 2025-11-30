package BitManipulation;

import java.util.Scanner;
// 2nd
/*
    n = 1101 (in binary)
    so approach is take indices starting from right 0 to n-1 (left) and do 2^0*right+2^1+(right-1)+so on..
    so ans = 13 (as 1+0+4+8)
*/
public class Q02ConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no. : ");
//        int n = sc.nextInt();

        System.out.println("Enter no.");
        String x = sc.next();
        System.out.println(convertBinaryToDecimal(x));
    }
//    private static int convertBinaryToDecimal(int n){
//        int decimal = 0;
//        int base = 1;
//        while(n!=0){
//            int lastDigit = n%10;
//            decimal+=lastDigit*base;
//            base=base*2;
//            n/=10;
//        }
//        return decimal;
//    }

    // Tc = O(n) n characters
    // Sc = O(1)
    private static int convertBinaryToDecimal(String x){
        int decimal = 0;
        int base = 1;
        for(int i=x.length()-1;i>=0;i--){
            char bit = x.charAt(i);
            if(bit=='1'){
                decimal+=base;
            }
            base*=2;
        }
        return decimal;
    }
}
