package Operator.LoopPractice;
import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int input = get.nextInt();

        for (int i = 1; i<=input; i++){
            if(i%2==1){
                System.out.println("Odd numbers are: " + i);
            }
        }
        get.close();
    }
}
