package Operator.LoopPractice;
import java.util.Scanner;

public class PrintFactorIDK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i ++){
            for (int a = 1; a <= i; a ++){
                int product = a * i;
                
                if (product == num){
                    System.out.println(i + " x " + a + " = " + product);
                }   
            }
        }

        input.close();
    }
}
