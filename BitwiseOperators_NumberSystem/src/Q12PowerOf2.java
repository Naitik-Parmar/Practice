public class Q12PowerOf2 {
    public static void main(String[] args) {
        int n=21;  // note : fix for n=0
        boolean ans = (n&(n-1))==0;
        System.out.println(ans);
    }
}
