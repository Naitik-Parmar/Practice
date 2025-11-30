public class Q5ClearBit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int notMask=~bitMask;

        System.out.println(n&notMask);

        if((n&bitMask)==0)
            System.out.println("bit is 0");
        else
            System.out.println("Bit is 1");
    }
}
