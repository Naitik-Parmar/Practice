package BitManipulation;

/*
    nums = [ 5, 5, 5, 6, 4, 4, 4]
    every number will appear thrice, except for 1 number, we need to return that number.
    so ans = 2
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q14SingleNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNumber2(arr));
    }

    // Better Approach
    // Tc = O(n*logm) + (m) where m=size of map i.e. m=(n/3)+1
    // Sc = O(m) where m = (n/3)+1
//    private static int singleNumber2(int[] arr){
//        int n = arr.length;
//        Map<Integer,Integer> map = new HashMap<>();
//
//        for(int i=0;i<n;i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        for(Map.Entry<Integer,Integer> it : map.entrySet()){
//            if(it.getValue()==1){
//                return it.getKey();
//            }
//        }
//        return -1;
//    }

    // Good Approach
    /*
        nums = [ 5, 5, 5, 6, 4, 4, 4 ]

         indexes =>  2 1 0
                5 -> 1 0 1
                5 -> 1 0 1
                5 -> 1 0 1
                6 -> 1 1 0
                4 -> 1 0 0
                4 -> 1 0 0
                4 -> 1 0 0

                so for 0 index, 3 set bits, which is a multiple of 3 , so definitely single number doesn't
                contain set a bit at index 0, for index 1 , set bit is 1, which is not a multiple of 3,
                so in this case out single number contains set a bit as 1, and for index 2 , total set bits are
                7 which is again not a multiple of 3 so again this contains a set bit for ou single number.
                So, finally 1 1 0 is our answer so return 6 as answer.
     */

    // Tc = O(n*32) foe best/avg/worst
    // Sc = O(1)
//    private static int singleNumber2(int[] arr){
//        int n = arr.length;
//        int ans = 0;
//        for(int i=0;i<32;i++){
//            int cnt = 0;
//            for(int j=0;j<n;j++){
//                if((arr[j]&(1<<i))!=0){
//                    cnt++;
//                }
//            }
//            if(cnt%3!=0){
//                ans = ans | (1<<i);
//            }
//        }
//        return ans;
//    }

    // Next Approach
    // for ex. arr = [ 2, 2, 1, 2, 1, 1, 4, 3, 4, 4 ]
    // first we will sort the array and then
    // arr will become [ 1, 1, 1, 2, 2, 2, 3, 4, 4, 4 ]
    // so now we will start from the first 1st index that 0 and then 1, so we will check the element
    // at 0th i.e. 1==1 element at 1st , yes it is, so we will move 3 places ahead that is at 4th index
    // again check with 3rd index 2==2 so again move 3 places ahead at 7th index , 3==4 so here we will return
    // 6th index element i.e. 3 which is our required answer
    // if single element is at 0th index, then also this algorithm will work
    // if single element is at last then we will apply the algorithm till last possible index, if the
    // answer is not found in between that means , answer is at last index always as it is given that there will
    // be a single element always present in the array.

    // Tc = O(nlogn)+(n/3) nlogn for sorting the array and n/3 number of iterations in the loop so
    // total = O(nlogn)
    // Sc = O(1)

//    private static int singleNumber2(int[] arr){
//        int n = arr.length;
//        Arrays.sort(arr);
//
//        for(int i=1;i<n;i+=3){
//            if(arr[i-1]!=arr[i]) {
//                return arr[i - 1];
//            }
//        }
//        return arr[n-1];
//    }

    // Tc = O(n)
    // Sc = O(1)
    private static int singleNumber2(int[] arr){
        int n = arr.length;
        int ones = 0, twos = 0;
        for(int i=0;i<n;i++){
            ones = (ones^(arr[i])) & ~twos;
            twos = (twos^(arr[i])) & ~ones;
        }
        return ones;
    }
}
