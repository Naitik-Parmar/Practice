public class B2OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr={1,3,5,6,8,9,11,23,34,45};
        int[] arr={99,88,76,67,65,54};
        int target=54;

        System.out.println(orderAgnosticBS(arr,target));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(isAsc){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
