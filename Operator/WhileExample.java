package Operator;
import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = input.nextLine();
        }
        System.out.println("Welcome " + name);
        
        input.close();
    }
}
