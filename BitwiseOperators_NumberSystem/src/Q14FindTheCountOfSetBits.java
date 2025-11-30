public class Q14FindTheCountOfSetBits {
    public static void main(String[] args) {
        int n=123;
        System.out.println(Integer.toBinaryString(n));
        int cnt=0;
//        while(n>0){
//            if((n&1)==1){
//                cnt++;
//            }
//            n=n>>1;
//        }

//        while(n>0){
//            cnt++;
//            n-=(n&(-n));
//        }

        while(n>0){
            cnt++;
            n=n&n-1;
        }
        System.out.println(cnt);
    }
}
