import java.util.Arrays;

public class A2ConcatenationOfArray {
    public static void main(String[] args) {
        /* Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]*/

        int[] nums={1,3,2,1};
        int[] ans=new int[2*nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[i+ nums.length]=nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
