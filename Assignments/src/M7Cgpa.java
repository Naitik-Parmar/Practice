import java.util.Scanner;

public class M7Cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int subjects=sc.nextInt();
        int sum=0;
        for(int i=0;i<subjects;i++){
            int subject=sc.nextInt();
            sum+=subject;
        }
        System.out.print("CGPA is : ");
        System.out.println((double) sum/subjects/10);

        System.out.print("Percentage is : ");
        System.out.println((double) sum/subjects/10*9.5);

    }
}
