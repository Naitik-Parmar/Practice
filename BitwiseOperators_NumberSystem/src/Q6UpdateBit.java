import java.util.Scanner;

public class Q6UpdateBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();

        int n=5;
        int pos=2;
        int bitMask=1<<pos;

        if(oper==1){
            System.out.println(bitMask|n);
        }
        else{
            int newBitMask=~bitMask;
            System.out.println(newBitMask&n);
        }
    }
}
