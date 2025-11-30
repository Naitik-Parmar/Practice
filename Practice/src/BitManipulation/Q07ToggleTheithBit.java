package BitManipulation;

import java.util.Scanner;

/*
    if n = 13
    i.e. in binary it is { 1, 1, 0, 1} so toggling means making 1->0 and 0->1
    so 1 1 0 1 ans for i=2
    do^0 1 0 0 so ans = 1001 i.e. 9
*/
public class Q07ToggleTheithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n = sc.nextInt();

        System.out.println("Enter the ith bit : ");
        int i = sc.nextInt();

        System.out.println(toggleTheithBit(n, i ));
    }
    private static int toggleTheithBit(int n, int i){
        return n^(1<<i);
    }
}
