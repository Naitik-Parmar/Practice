package BitManipulation;

import java.util.Scanner;

/*
    n = 13 i.e { 1 1 0 1 } set bits are 3 so ans = 3
    n = 12 i.e { 1 1 0 0 } set bits are 2 so ans = 2
    n = 16 i.e { 1 0 0 0 } set bit is 1 so ans = 1
*/
public class Q10CountTheNumberOfSetBitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to check its set bits : ");
        int n = sc.nextInt();

        System.out.println("Count of set bits is : "+countAllSetBits(n));
    }

    // brute force but we can optimize it such that if(n&1==1) and n>>2;
    // for example
    // n = 13
    // i.e. { 1 1 0 1 } 1 1 0 1 & 1==1 so cnt = 1 and then 1 1 0 & 1 = 0 ans so on
//    private static int countAllSetBits(int n){
//        int cnt = 0;
//        while(n!=0){
//            if(n%2==1){
//                cnt++;
//            }
//            n/=2;
//        }
//        return cnt;
//    }

//    private static int countAllSetBits(int n){
//        int cnt = 0;
//        while(n!=0){
//            cnt+=n&1;
//            n=n>>1;
//        }
//        return cnt;
//    }

    // good approach
    /*
    n = 13 (1101)
    Iteration 1: n = 1101 & 1100 = 1100
    Iteration 2: n = 1100 & 1011 = 1000
    Iteration 3: n = 1000 & 0111 = 0000
    → count = 3
     */
    // Tc = O(no.of se bits) O(31) worst case for integer
    // Sc = O(1)
//    private static int countAllSetBits(int n){
//        int cnt = 0;
//        while(n!=0){
//            n=n&n-1;
//            cnt+=1;
//        }
//        return cnt;
//    }

    // Using built function in java
    // Tc = O(1)
    // Sc = O(1)
    private static int countAllSetBits(int n){
        return Integer.bitCount(n);
    }
}
