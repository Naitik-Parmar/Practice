import java.util.Arrays;

public class C2BinarySearch {
    public static void main(String[] args) {
        int[] arr={5,3,4,6,7,1,9};
        int element=7;

        Arrays.sort(arr);
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
        int res=Arrays.binarySearch(arr,element);
        System.out.println(res<0?"Element not present":"Element present at index : "+res);
    }
}
