public class B4LinearSearchInString {
    public static void main(String[] args) {
        String name="Naitik";
        char target = 'k';
        System.out.println(StringSearch(name,target));
    }
    static int StringSearch(String name,char target){
//        if(name.length()==0){
//            return -1;
//        }
        if(name.isEmpty()){
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            char c=name.charAt(i);
            if(c==target){
                return i;
            }
        }
        return -1;
    }
}
