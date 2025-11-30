import java.util.Arrays;

public class A6KidsWithTheGreatestNoOfCandies {
    public static void main(String[] args) {
        /*
        Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

         */
        int[] candies={4,2,1,1,2};
        int extra=1;
        boolean[] b=new boolean[candies.length];
        int max=0;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max=candies[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extra>=max){
                b[i]=true;
            }
            else{
                b[i]=false;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
