import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(isODD(68));
        int[] arr={1,2,3,4,5,1,3,4,5,7,8,8,2};
        System.out.println(isUnique(arr));
        
        ithBit(182);
        setBit(5);
        clearBit(5);
//        updateBit(5);
        findRight(12);
        findLeft(15);
        find2ndRight(12);
    }

    private static void find2ndRight(int n) {
        int pos=1;
        int c=0;

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
        else
            System.out.println("Not present");
    }

    private static void findLeft(int n) {
        int pos=0;
        while(n>0){
            n=n>>1;
            pos++;
        }
        System.out.println(pos);
    }

    private static void findRight(int n) {
        int pos=1;
        while((n&1)==0){
            n=n>>1;
            pos++;
        }
        System.out.println(pos);
    }

    private static void updateBit(int n) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int pos=2;
        int bitMask=1<<pos;
        if(oper==1)
            System.out.println(bitMask|n);
        else{
            int not=~bitMask;
            System.out.println(n&not);
        }
    }

    private static void clearBit(int n) {
        int pos=2;
        int bitMask=1<<pos;
        int not=~bitMask;
        System.out.println(n&not);
    }

    private static void setBit(int n) {
        int pos=1;
        int bitMask=1<<pos;
        System.out.println(bitMask|n);
    }

    private static void ithBit(int n) {
        int pos=3;
        int bitMask=1<<pos;
        if((bitMask&n)==0){
            System.out.println("Bit is 0");
        }
        else
            System.out.println("Bit is 1");
    }

    private static int isUnique(int[] arr) {
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }

    private static boolean isODD(int n) {
        return (n&1)==1;
    }
}
