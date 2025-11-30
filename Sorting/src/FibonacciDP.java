public class FibonacciDP {
    public static void main(String[] args) {
        D d=new D();
        System.out.println(d.m1(0,1));
    }
}
class D{
    int count=0;
    long m1(long n1,long n2){
        count++;
        long ans=0;
        System.out.println(n1 + " " +n2);
        ans=n1+n2;
        n1=n2;
        n2=ans;
        if(count==9){
            return 0;
        }
        return ans+m1(n1,n2);
    }
}
