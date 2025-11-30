public class RecursionFinalDemo {
    public static void main(String[] args) {
        C c=new C();
        int input=10;
        System.out.println(c.m1(input));
    }
}
class C{
    int m1(int input){
        int ans=0;
        if (input==0)
            return 0;
        ans=ans+input*10;
        input=input-2;
        return ans+m1(input);
    }
}