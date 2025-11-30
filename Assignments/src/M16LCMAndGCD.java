import java.util.Scanner;

public class M16LCMAndGCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int lcmMax=(num1>num2)?num1:num2;
        while(true){
            if(lcmMax%num1==0 && lcmMax%num2==0){
                System.out.println("Lcm is : "+lcmMax);
                break;
            }
            lcmMax++;
        }
        int gcd=1;
        gcd=(num1*num2)/lcmMax;
        System.out.println(gcd);
    }
}
