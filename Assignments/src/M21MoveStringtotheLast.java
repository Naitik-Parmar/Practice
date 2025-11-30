import java.util.Scanner;

public class M21MoveStringtotheLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String hash="";
        String rem="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                hash+=s.charAt(i);
            }
            else{
                rem+=s.charAt(i);
            }

        }
        System.out.println(hash+rem);
    }
}
