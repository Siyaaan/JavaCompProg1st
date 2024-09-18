package Operator.LoopPractice;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Take user input
        int reversedNum = 0;

        sc.close();
        
        for(; num > 0; num /= 10) {   // Continue until num becomes 0
            int lastDigit = num % 10; // Extract last digit
            reversedNum = reversedNum * 10 + lastDigit; // Build reversed number
        }
            System.out.println("Reversed Number: " + reversedNum);

        
        // For loop to reverse the number     
    }
}
