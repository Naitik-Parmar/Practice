package BitManipulation;

import java.util.Scanner;

public class Q03SwapTwoNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. : ");
        int a = sc.nextInt();

        System.out.println("Enter second no. : ");
        int b = sc.nextInt();

        swapTwoNumbersWithoutThirdVariable(a,b);
    }
    private static void swapTwoNumbersWithoutThirdVariable(int a, int b){
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println(a+" " +b);
    }

}
