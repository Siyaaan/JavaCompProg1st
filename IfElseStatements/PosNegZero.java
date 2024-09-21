package IfElseStatements;
import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num = scanner.nextInt();

        if (num == 0){
            System.out.println("Num is 0");
        } else if (num > 0) {
            System.out.println("Num is POSITIVE");
        }   else {
            System.out.println("Num is NEGATIVE");
        }

        scanner.close();
    }
}
