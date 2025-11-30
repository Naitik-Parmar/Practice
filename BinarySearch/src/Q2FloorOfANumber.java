public class Q2FloorOfANumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,8,9,11,23,34,45};
        int target=50;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return target;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}
