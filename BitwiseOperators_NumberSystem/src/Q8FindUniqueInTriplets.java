public class Q8FindUniqueInTriplets {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,2,4,4,2,1,3,3,5};
        System.out.println(uniqueInTriplets(arr));
    }

    private static int uniqueInTriplets(int[] arr) {
        int ans=0;
        for (int i = 0; i < 32; i++) {
            int cnt=0;
            for (int j = 0; j < arr.length; j++) {
                if( ((arr[j]>>i)&1)==1){
                    cnt++;
                }
            }
            if(cnt%3!=0){
                ans+=1<<i;
            }
        }
        return ans;
    }
}
