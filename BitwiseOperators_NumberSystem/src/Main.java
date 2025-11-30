import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("uxux");

        int[] arr={1,2,3,4,5,1,3,4,5};
        System.out.println(isOdd(68));
        System.out.println(unique(arr));
        ithBit(182);
        setBit(5);
        clearBit(5);
        updateBit(5);
        findRightMostBit(12);
    }

    private static void findRightMostBit(int n) {
        int pos=1,c=0;
        while(n>0){
            if((n&1)==1){
                c++;
                if(c==2)
                    break;
            }
            n=n>>1;
            pos++;
        }
        if(c==2)
        System.out.println(pos);
        else System.out.println("Not found");
    }

    private static void updateBit(int n) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int pos=2;
        int bitMask=1<<pos;
        if(oper==1){
            System.out.println(bitMask|n);
        }
        else{
            int notMask=~bitMask;
            System.out.println(notMask&n);
        }
    }

    private static void clearBit(int n) {
        int pos=2;
        int bitMask=1<<pos;
        int notMask=~bitMask;
        System.out.println(notMask&n);
    }

    private static void setBit(int n) {
        int pos=1;
        int bitMask=1<<pos;
        System.out.println(bitMask|n);
    }

    private static void ithBit(int n) {
        int pos=3;
        int bitMask=1<<pos;
        if((n&bitMask)==0){
            System.out.println("bit is 0");
        }
        else System.out.println("bit is 1");
    }

    private static int unique(int[] arr) {
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }

    private static boolean isOdd(int n) {
        return (n&1)==1;
    }
}