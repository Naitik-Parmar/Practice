import java.util.Scanner;

public class M5PowerInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int power=sc.nextInt();

        int res=1;
        for(int i=power;i!=0;i--){
            res=res*n;
        }
        System.out.println(res);

        System.out.println(Math.pow(2,3));
    }
}
