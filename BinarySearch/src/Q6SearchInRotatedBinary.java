public class Q6SearchInRotatedBinary {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(pivot(arr));
    }
    public int search(int[] nums, int target) {
        int pivotAns=pivot(nums);

        if(pivotAns==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivotAns]==target){
            return pivotAns;
        }
        if(nums[0]>=target){
            return binarySearch(nums,target,0,pivotAns-1);
        }
        return binarySearch(nums,target,pivotAns+1, nums.length-1);
    }
    static int pivot(int[] arr){
        int start=0;
        int end= arr.length-1;

        int mid=start+(end-start)/2;

        while(start<=end){
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){


        while(start<=end){
            int mid=(start)+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
