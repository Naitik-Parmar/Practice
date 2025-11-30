package BitManipulation;

/*
     remove the last set means if n = 16 i.e {1 0 0 0 0} and remove the last set bit which is 1 so n = 0 ans
     as 1 0 0 0 0  this follows for n = 40 i.e. 1 0 1 0 0 0 so remove the last set bit from right
        0 1 1 1 1                               1 0 0 1 1 1 so this is 32 so if we do (n&n-1) we will be
        able to remove the last set bit!        1 0 0 0 0 0 ans = 32
*/

import java.util.Scanner;

public class Q08RemoveTheLastSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n = sc.nextInt();

        System.out.println("After Removing the last set bit: "+removeTheLastSetBit(n));
    }
    private static int removeTheLastSetBit(int n){
        return n&n-1;
    }
}
