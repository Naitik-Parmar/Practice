public class Q16XorBetweenRange {
    public static void main(String[] args) {
        int a=4;
        int b=8;
        int ans=xor(b)^xor(a-1);
        System.out.println(ans);
    }
    static int xor(int a){
        if(a%4==0)
            return a;
        else if(a%4==1)
            return 1;
        else if(a%4==2)
            return a+1;
        return 0;
    }
}
