import java.util.Scanner;

public class M19CountEvenDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            char l=word.charAt(0);
            boolean b=true;
            for(int j=0;j<word.length();j++){
                if(j%2==0){
                    if(word.charAt(j)!=l){
                        b=false;
                        break;
                    }
                    else{
                        continue;
                    }
                }
            }
            if(b){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}