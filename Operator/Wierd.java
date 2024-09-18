package Operator;
import java.util.Scanner;

//ABSOLUTE NUMBER (negative turns into positive)

public class Wierd {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter a number: " );
        int num = get.nextInt();
        
        System.out.println(Math.abs(num));

        get.close();

    }
}
