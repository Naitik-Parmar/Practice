import java.util.Scanner;

public class A14VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        float h=sc.nextFloat();

        System.out.println((float)1/3*(Math.PI*r*r*h));
    }
}
