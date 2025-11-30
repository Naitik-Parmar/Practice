import java.util.Scanner;

public class M3Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dis=sc.nextInt();

       double finaldis=num*((double) dis /100);
        System.out.println(finaldis);

        System.out.println(num-finaldis);
    }
}
