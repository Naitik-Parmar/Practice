import java.util.Scanner;

public class M15GCDAndLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int gcd=1;
        int min=(num1>num2)?num2:num1;
        for(int i=1;i<=min;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD is : "+gcd);

        int lcm=1;
        lcm=(num1*num2)/gcd;
        System.out.println("LCM is : "+lcm);
    }
}
