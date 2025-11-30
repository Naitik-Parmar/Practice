import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rev(int[] arr) {
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}