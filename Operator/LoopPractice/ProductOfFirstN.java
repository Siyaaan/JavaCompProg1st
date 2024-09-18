package Operator.LoopPractice;
import java.util.Scanner;


public class ProductOfFirstN {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("enter: ");
        int n = get.nextInt();
        int product = 1;

        for(int num=1; num<=n; num++){
            product *= num;
        }

        System.out.print(product);
        get.close();
    }
}