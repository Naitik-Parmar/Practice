package BitManipulation;

import java.util.Scanner;

/*
    n = 13 i.e is { 1 1 0 1 } in binary sp clear the ith bit means make bit 0 if it is 1 and if it is 0, keep as 0
    so 1 1 0 1
    &  1 0 1 1 will do the work so try to keep 0 below ith bit and other as 1's and do the end to get answer
*/
public class Q06ClearTheithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n = sc.nextInt();

        System.out.println("Enter ith bit to clear : ");
        int i = sc.nextInt();
        System.out.println(clearTheithBit(n, i));
    }
    private static int clearTheithBit(int n, int i){
        return n&~(1<<i);
    }
}
