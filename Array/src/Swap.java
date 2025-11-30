import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={12,34,21,45,32};
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
