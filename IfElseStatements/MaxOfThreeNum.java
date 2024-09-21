package IfElseStatements;
import java.util.Scanner;

public class MaxOfThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        if (a > b && b > c){
            System.out.println("A is the largest number");
        }   else if (b > a && b > c){
            System.out.println("B is the largest number ");
        }   else {
            System.out.println("C is the largest number");
        }

        scanner.close();
    }
}
