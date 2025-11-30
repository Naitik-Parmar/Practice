public class Q4SquareRootOfANumber {
    public static void main(String[] args) {
        int n=40;
        System.out.println(sqrt(n));
    }
    static int sqrt(int n){
        int start=0;
        int end=n;


        while(start<=end){
            int mid=(start)+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
