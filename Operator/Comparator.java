package Operator;
import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner compare = new //placing Scanner Class
        Scanner (System.in);

            System.out.println("Enter a Number: "); //Getting the age
            int number = compare.nextInt();
        
        compare.close();

        if (number >= 60){ //Getting the result
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are NOT a senior citizen");
        }
    }
}
