import java.util.Scanner;

public class M6BattingAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int runs=sc.nextInt();
        int matches=sc.nextInt();
        int not_outs=sc.nextInt();

        int res=matches-not_outs;
        if(res==0){
            System.out.println("NA");
        }
        else {
            System.out.println((double) runs / res);
        }
    }
}
