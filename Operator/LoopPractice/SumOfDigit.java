package Operator.LoopPractice;
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        
        int digit = get.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= digit; digit /= 10){
            int hold = digit % 10;
            
            sum = sum + hold;
        }
        System.err.println(sum);
        get.close();

    }
}
