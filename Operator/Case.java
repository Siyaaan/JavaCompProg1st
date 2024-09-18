package Operator;
import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner natural = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
    
        do {
            number = natural.nextInt();
                if(number>100) {
                    System.out.print("Lower a number: ");
                }    else if (number % 2 == 0) {
                    System.out.print("Even");
                } else {
                    System.out.print("Odd");
                }
        }
        while (number > 100);
        natural.close();
    }
}