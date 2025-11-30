public class Q15XORUntoValue {
    public static void main(String[] args) {
        int a=6;
//        int ans=0;
//        for (int i = 0; i <=a; i++) {
//            ans=ans^i;
//        }
//        System.out.println(ans);

        if(a%4==0)
            System.out.println(a);
        else if(a%4==1)
            System.out.println(1);
        else if(a%4==2)
            System.out.println(a+1);
        else
            System.out.println(0);
    }
}
