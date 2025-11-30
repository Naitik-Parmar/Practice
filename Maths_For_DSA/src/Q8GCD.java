public class Q8GCD {
    public static void main(String[] args) {
        System.out.println(gcd(105,214));
    }

    private static int gcd(int a, int b) {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}
