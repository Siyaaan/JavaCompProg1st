import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        double num = input.nextDouble();
        int num1 = 1;
        
        while (num > 0){
            num = num % 10;
            num1++;
        }
        
        System.out.print("Number of digits: " + num1);
        
        input.close();
    }
}