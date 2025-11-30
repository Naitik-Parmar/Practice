public class Q1CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,8,9,11,23,34,45};
        int target=46;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

        if(arr.length==0){
            return -1;
        }
        if(target>arr[end]){
            return -1;
        }
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
        return arr[start];
    }
}
