package IfElseStatements;
import java.util.Scanner;

public class DivByFiveAndEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        if (a % 5 == 0 && a % 11 == 0){
            System.out.println("The number is both divisible by 5 and 11");
        }   else {
            System.out.println("INVALID");
        }

        scanner.close();
    }
}
