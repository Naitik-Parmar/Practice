public class Q3FindTheithBit {
    public static void main(String[] args) {
        int n=182; // 10110110
        int pos=4;
        int bitMask=1<<pos-1;

        if((n&bitMask)==0){
            System.out.println("O");
        }
        else
            System.out.println("1");
    }
}
