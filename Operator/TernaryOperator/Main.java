package Operator.TernaryOperator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int get = input.nextInt();

        String output = (get > 40) ? "Passed" : "Fail";
            System.out.println("You " + output +" The Exam");
        input.close();
    }
}
