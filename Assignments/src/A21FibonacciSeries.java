import java.util.Scanner;

public class A21FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0;
        int b=1;
        int count=2;

        while(count<=n){
            System.out.print(b+" ");
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
    }
}
