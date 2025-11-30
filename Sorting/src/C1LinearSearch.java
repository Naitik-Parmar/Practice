public class C1LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search");

        int[] arr={1,5,3,6,8,4,3,9};
        int element=9;

        int numComparision=0;
        boolean isPresent=false;

        for(int e:arr){
            numComparision++;
            if(e==element){
                isPresent=true;
                break;
            }
        }
        System.out.println(isPresent?"Element present , numComparisions : "+numComparision:"Element not present, numComparisions : "+numComparision);
    }
}
