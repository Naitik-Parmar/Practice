public class Q7$2FindLeftMostBit {
    public static void main(String[] args) {
        findLeftMostBit(15);
    }

    private static void findLeftMostBit(int n) {
        int pos=0;
        while(n>0){
            n=n>>1;
            pos++;
        }
        System.out.println(pos);
    }
}
