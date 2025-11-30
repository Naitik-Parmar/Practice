package BitManipulation;

/*
    nums = [ 4, 1, 2, 1, 2 ]
    ans = 4 , all other numbers are occurring twice bit only  4 is occurring once
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q13SingleNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNumber1(arr));
    }

    // Brute Force
    // Tc = O(n^2)
    // Sc = O(1)
//    private static int singleNumber1(int[] arr){
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            int cnt = 0;
//            for(int j=0;j<n;j++){
//                if(arr[i]==arr[j]){
//                    cnt++;
//                }
//            }
//            if(cnt==1){
//                return arr[i];
//            }
//        }
//        return -1;
//    }

    // Better Approach
    // Tc = O(m*logn)+(m) where m=(n/2)+1 is size of the map
    // Sc = O(m) where m = (n/2)+1
//    private static int singleNumber1(int[] arr){
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

    // Optimized Approach
    // Tc = O(n)
    // Sc = O(1)
    private static int singleNumber1(int[] arr){
        int xor = 0;
        for(int e:arr){
            xor=xor^e;
        }
        return xor;
    }
}
