package IfElseStatements;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        if (a % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        scanner.close();
    }
}
