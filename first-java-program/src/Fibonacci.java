import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0,b=1,c=0,term=0;
        while(term<=n){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            term++;
        }
    }
}
