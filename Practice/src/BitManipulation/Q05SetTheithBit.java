package BitManipulation;

/*
    n = 13
    in binary (1 1 0 1) so for i = 1 we need to do (n orOf (1<<i)) so if it is 0 it will become 1 and
    for 1 it will remain one and other bits will remain as it is.
*/

import java.util.Scanner;

public class Q05SetTheithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tht no. to check");
        int n = sc.nextInt();

        System.out.println("Enter the ith bit to set : ");
        int i = sc.nextInt();

        System.out.println(setTheithBit(n, i));
    }
    private static int setTheithBit(int n, int i){
        return n|(1<<i);
    }

}
