import java.util.Scanner;

public class M20digitsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=digitSum(i);
        }
        System.out.println(sum);

    }
    static int digitSum(int a){
        int s=0;
        while(a!=0){
            int rem=a%10;
            s=s+rem;
            a/=10;
        }
        return s;
    }
}
