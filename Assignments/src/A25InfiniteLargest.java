import java.util.Scanner;

public class A25InfiniteLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int largest=Integer.MIN_VALUE;
        while (true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            if(n>largest){
                largest=n;
            }
        }
        System.out.println(largest);
    }
}
