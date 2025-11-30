import java.util.Scanner;

public class A18VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float l=sc.nextFloat();
        float w=sc.nextFloat();
        float h=sc.nextFloat();

        System.out.println((l*w*h)/3);
    }
}
