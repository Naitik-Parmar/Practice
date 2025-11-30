import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String r="";
        for(int i=name.length()-1;i>=0;i--){
            r=r+name.charAt(i);
        }
        if(name.equals(r)){
            System.out.println("Palindromic");
        }
        else{
            System.out.println("Not");
        }
        System.out.println(r);
    }
}
