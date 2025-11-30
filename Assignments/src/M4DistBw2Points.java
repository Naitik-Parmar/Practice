import java.util.Scanner;

public class M4DistBw2Points {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int y1=sc.nextInt();
        int y2=sc.nextInt();

//        System.out.println((double) Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1)));
        System.out.println((double) Math.sqrt(Math.pow(y2-y1,2)+Math.pow(x2-x1,2)));
    }
}
