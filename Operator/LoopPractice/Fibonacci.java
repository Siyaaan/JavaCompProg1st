package Operator.LoopPractice;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1; // Starting values of the Fibonacci sequence

        System.out.print("Fibonacci Series: " + a + " " + b);

        //We'll start from the first 2 numbers

        for (int i = 2; i < n; i++) {
            int next = a + b; //This adds 0 and 1 from the variable
            System.out.print(" " + next); //It print first the result and then process the calculation afterward
            a = b;  //a becomes b, the value of 1 from b went to a which a = 1
            b = next;   //The value of b becomes next: next = 1 --> then becomes b = 1
        }

        sc.close();  
    }
}
