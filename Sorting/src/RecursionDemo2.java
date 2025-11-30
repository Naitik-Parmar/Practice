public class RecursionDemo2 {
    public static void main(String[] args) {
        A a=new A();
        int input=10;
        int ans=0;
        while(input>0){
            ans=ans+a.m1(input);
            input-=2;
        }
        System.out.println(ans);
    }
}
class A{
    int m1(int input){
        return input*10;
    }
}
