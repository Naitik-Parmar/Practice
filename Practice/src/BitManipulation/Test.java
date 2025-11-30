package BitManipulation;

// 1st convert decimal to binary

// 2nd convert binary into decimal

// 3rd swap two numbers without using the third variable

// 4th check the ith bit

// 5th set the ith bit

// 6th clear the ith bit

// 7th toggle the ith bit

// 8th remove the last set bit

// 9th check if the no. is a power of 2

// 10th count the total no. of sets in a number

// 11
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


// 12
/*
    nums =  [ 1, 2, 3 ]
    subset is a portion of elements in the same order
    ans = [], [1], [2], [1,2], [1,3], [2,3], [1,2,3] , so total subsets = 8
    task is to return all sets list inside list containing all the subsets

    if n = 3 , no. of subsets = 2^n = 8
    if n = 4 , no. of subsets = 2^n = 16
   *** or 2^n = 1<<n in bit wise bcz left shift of n is equivalent to 2^n.


                          0  1  2
   first convert nums = [ 1, 2, 3 ] into 3 bit indexes such as


             index =      2  1  0
                                           0 signifies => do not take, 1 signifies take
                 0        0  0  0      =    []
                 1        0  0  1      =    [1]
                 2        0  1  0      =    [2]
                 3        0  1  1      =    [1,2]
                 4        1  0  0      =    [3]
                 5        1  0  1      =    [1,3]
                 6        1  1  0      =    [2,3]
                 7        1  1  1      =    [1,2,3]
        so iterate through 0 th 2^n-1 where n=no. of elements in the set
*/

// 13
/*
    nums = [ 4, 1, 2, 1, 2 ]
    ans = 4 , all other numbers are occurring twice bit only  4 is occurring once
*/

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(singleNumber2(arr));
    }

    private static int singleNumber2(int[] arr){
        int n = arr.length;
        for(int i=0;i<32;i++){
            int
            for(int j=0;j<n;j++){

            }
        }
    }


}
