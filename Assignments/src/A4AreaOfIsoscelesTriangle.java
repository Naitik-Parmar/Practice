import java.util.Scanner;

public class A4AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();

        System.out.println((b/4)*Math.sqrt((4*a*a)-(b*b)));
    }
}
