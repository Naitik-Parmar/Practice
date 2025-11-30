import java.util.Scanner;

public class A19CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        float h=sc.nextFloat();

        System.out.println(2*Math.PI*r*h);
    }
}
