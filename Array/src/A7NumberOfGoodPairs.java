public class A7NumberOfGoodPairs {
    public static void main(String[] args) {
        /*
        Input: nums = [1,2,3,1,1,3]
            Output: 4
            Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
         */
        int[] nums={1,2,3};
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
