import java.util.Scanner;

public class A17VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();

        System.out.println((float)4/3*Math.PI*r*r*r);
    }
}
