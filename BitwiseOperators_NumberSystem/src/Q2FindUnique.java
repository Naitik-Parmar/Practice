public class Q2FindUnique {
    public static void main(String[] args) {
        int[] arr={1,2,2,4,5,4,6,5,1,3,6};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
