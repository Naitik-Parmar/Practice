package BitManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
public class Q12PowerSetPrintAllSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements to put in array");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        List<List<Integer>> res = powerSetPrintAllSubsets(list,n);
        for(List<Integer> li : res){
            System.out.print(li+" ");
        }

    }
    // Tc = O(n*2^n)
    // Sc = O(2^n*n)
    private static List<List<Integer>> powerSetPrintAllSubsets(List<Integer> list, int n){
        List<List<Integer>> ans = new ArrayList<>();

        int num=1<<n;

        for(int i=0;i<num;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    temp.add(list.get(j));
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
