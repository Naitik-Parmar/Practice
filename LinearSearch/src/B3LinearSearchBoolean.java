public class B3LinearSearchBoolean {
    public static void main(String[] args) {
        int[] arr={12,43,23,54,21,54,65,32};
        int target=65;
        System.out.println(linearSearch(arr,target));
    }
    static boolean linearSearch(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int i = 0; i <= arr.length; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
