public class Q7$1Find2ndRightMostBit {
    public static void main(String[] args) {
        find2ndRMBit(33);
    }

    private static void find2ndRMBit(int n) {
        int pos=1;
        int cnt=0;

        while(n>0){
            if((n&1)==1){
                cnt++;
                if(cnt==2)
                    break;
            }
            n=n>>1;
            pos++;
        }
        if(cnt==2)
            System.out.println(pos);
        else
            System.out.println("Not found");
    }
}
