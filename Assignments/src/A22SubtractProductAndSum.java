import java.util.Scanner;

public class A22SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int pro=Pos(n);
        int sum=add(n);
        System.out.println(pro-sum);
    }
    static int Pos(int n){
        int p=1;
        while(n>0){
            int rem=n%10;
            p=p*rem;
            n=n/10;
        }
        return p;
    }
    static int add(int n){
        int s=0;
        while(n>0){
            int rem=n%10;
            s=s+rem;
            n=n/10;
        }
        return s;
    }
}
