import java.util.Scanner;

public class M10ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        int temp1=no;
        int len=0;
        while(temp1!=0){
            len+=1;
            temp1/=10;
        }
        System.out.println(len);

        int temp2=no;
        int arm=0;


        while(temp2!=0){
            int rem=temp2%10;
            int mul=1;
            for(int i=1;i<=len;i++){
                mul=mul*rem;
            }
            arm+=mul;
            temp2/=10;
        }
        System.out.println(arm);
        if(no==arm){
            System.out.println(no+" : is Armstrong");
        }
        else{
            System.out.println(no+" : is not Armstrong");
        }
    }
}
