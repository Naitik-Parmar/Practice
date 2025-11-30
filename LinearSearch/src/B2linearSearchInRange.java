public class B2linearSearchInRange {
    public static void main(String[] args) {
        int[] arr={12,43,23,54,21,54,65,32};
        int target=54;
        int start=1;
        int end=4;
        System.out.println(linearSearchInRange(arr,target,start,end));
    }
    static int linearSearchInRange(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <=end; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
