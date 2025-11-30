public class A10FindTheHighestAltitude {
    public static void main(String[] args) {
        /*
        Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
         */
        int[] gain={-5,1,5,0,-7};
//        int[] gain={-4,-3,-2,-1,4,3,2};
        int sum=0,max=0,ans=0;
        for (int i = 0; i < gain.length; i++) {
            sum+=gain[i];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
