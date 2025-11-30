import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double rs=sc.nextDouble();

        double dlr=rs/83.01;
        System.out.println(dlr+"USD");
    }
}
