package BitManipulation;

import java.util.Scanner;

/*
    for n = 10 and goal = 7 ans = 3 bit to flip
    as 10 in binary is { 1 0 1 0 } and 7 is { 0 1 1 1}
    so xor of start and goal = 1 0 1 0
                               0 1 1 1
                              ^--------
                               1 1 0 1 so set bits = 3 , so count set bits = 3 therefore ans = 3

    for n = 3 and goal = 4
    as 3 in binary is { 0 1 1 } and 4 is { 1 0 0 }
    so xor of start and goal = 0 1 1
                               1 0 0
                              ^------
                               1 1 1 so set bits = 3, so count set bits = 3, therefore ans = 3

*/
public class Q11MinimumBitFlipsToConvertNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start no. : ");
        int start = sc.nextInt();

        System.out.println("Enter the goal : ");
        int goal = sc.nextInt();

        System.out.println(minimumBitFlipsToConvertNumber(start,goal));
    }
    /*

        Time Complexity: O(k) ≈ O(log n) where k is no. of set bits present in (start^goal)
        Space Complexity: O(1)
     */
    private static int minimumBitFlipsToConvertNumber(int start, int goal){
        int ans = start ^ goal;    // XOR finds differing bits
        int cnt = 0;
        while (ans != 0){
            ans = (ans & (ans - 1));  // removes last set bit
            cnt++;
        }
        return cnt;
    }
}
