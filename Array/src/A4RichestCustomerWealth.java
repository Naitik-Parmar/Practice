public class A4RichestCustomerWealth {
    public static void main(String[] args) {
        /*
        Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
         */
        int max=0;
        int[][] accounts = {{1,5},{3,7},{3,5}};
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(max<sum){
                max=sum;
            }

        }
        System.out.println(max);
    }
}
