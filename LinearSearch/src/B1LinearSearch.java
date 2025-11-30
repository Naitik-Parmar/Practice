public class B1LinearSearch {
    public static void main(String[] args) {
        int[] arr={12,43,23,54,21,54,65,32};
        int target=322;
        System.out.println(linearSearch(arr,target));
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
