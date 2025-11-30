import java.util.Arrays;

public class A5ShuffleTheArray {
    public static void main(String[] args) {
        /*
        Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
         */
        int[] nums={1,1,2,2};
        int len= nums.length/2;
        int[] ans=new int[nums.length];
        for (int i = 0; i < len; i++) {
            ans[i*2]=nums[i];
            ans[i*2+1]=nums[i+len];
        }
        System.out.println(Arrays.toString(ans));
    }
}
