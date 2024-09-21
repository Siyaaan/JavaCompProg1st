package IfElseStatements;
import java.util.Scanner;

public class MaxOfTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println("A is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        scanner.close();
    }
}
