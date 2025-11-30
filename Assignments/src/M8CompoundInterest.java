import java.util.Scanner;

public class M8CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();

        System.out.println( p*(Math.pow(1+  r /100,t)));
    }
}
