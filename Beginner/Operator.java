import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new
        Scanner(System.in);

            System.out.println("Enter: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            input.nextLine();
            System.out.println("Enter a string: ");
            String num3 = input.nextLine();
            
                System.out.println("num 1 (before): " + num1);

                num1 = num2;

                System.out.println("num 1 (after): " + num1);

                System.out.println("Heilo: " + num3);

        input.close();
    }
}
